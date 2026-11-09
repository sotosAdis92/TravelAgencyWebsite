package com.example.server.service.impl;

import com.example.server.dto.response.BookingResponse;
import com.example.server.entity.User;
import com.example.server.mapper.BookingMapper;
import com.example.server.repository.BookingRepository;
import com.example.server.service.BookingService;

import java.util.List;

public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;

    public BookingServiceImpl(BookingRepository bookingRepository, BookingMapper bookingMapper) {
        this.bookingRepository = bookingRepository;
        this.bookingMapper = bookingMapper;
    }

    @Override
    public List<BookingResponse> findByUser(User user) {
        List<BookingResponse> bookingResponses = bookingMapper.toDto(bookingRepository.findByUser(user));
        return List.of();
    }
}
