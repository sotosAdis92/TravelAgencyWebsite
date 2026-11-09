package com.example.server.service.impl;

import com.example.server.dto.request.BookingRequest;
import com.example.server.dto.response.BookingResponse;
import com.example.server.dto.response.TripResponse;
import com.example.server.entity.Trip;
import com.example.server.entity.User;
import com.example.server.mapper.BookingMapper;
import com.example.server.repository.BookingRepository;
import com.example.server.service.BookingService;
import com.example.server.service.TripService;

import java.util.List;

public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;
    private final TripService tripService;

    public BookingServiceImpl(BookingRepository bookingRepository, BookingMapper bookingMapper, TripService tripService) {
        this.bookingRepository = bookingRepository;
        this.bookingMapper = bookingMapper;
        this.tripService = tripService;
    }

    @Override
    public List<BookingResponse> findByUser(User user) {
        List<BookingResponse> bookingResponses = bookingMapper.toDto(bookingRepository.findByUser(user));
        return bookingResponses;
    }

    public BookingResponse makeBooking(User user, BookingRequest bookingRequest){

    }
}
