package com.example.server.service.impl;

import com.example.server.dto.request.BookingRequest;
import com.example.server.dto.response.BookingResponse;
import com.example.server.dto.response.TripResponse;
import com.example.server.entity.Booking;
import com.example.server.entity.Trip;
import com.example.server.entity.User;
import com.example.server.mapper.BookingMapper;
import com.example.server.mapper.TripMapper;
import com.example.server.repository.BookingRepository;
import com.example.server.service.BookingService;
import com.example.server.service.TripService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;
    private final TripService tripService;
    private final TripMapper tripMapper;

    public BookingServiceImpl(BookingRepository bookingRepository, BookingMapper bookingMapper, TripService tripService, TripMapper tripMapper) {
        this.bookingRepository = bookingRepository;
        this.bookingMapper = bookingMapper;
        this.tripService = tripService;
        this.tripMapper = tripMapper;
    }

    @Override
    public List<BookingResponse> findByUser(User user) {
        List<BookingResponse> bookingResponses = bookingMapper.toDto(bookingRepository.findByUser(user));
        return bookingResponses;
    }

    public BookingResponse makeBooking(User user, BookingRequest bookingRequest){
        Trip tripFromRequest = tripMapper.toEntity(tripService.findById(bookingRequest.tripId()));
        User userFromRequest = user;
        Booking booking = bookingMapper.toEntity(bookingRequest,tripFromRequest,userFromRequest);
        return bookingMapper.toDto(bookingRepository.save(booking));
    }

    @Override
    public boolean deleteBooking(Long id, User user) {
        return bookingRepository.findById(id).filter(b -> b.getUser().getId().equals(user.getId())).map(b -> {
            bookingRepository.delete(b);
            return true;
        }).orElse(false);
    }
}
