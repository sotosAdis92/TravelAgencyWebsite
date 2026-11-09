package com.example.server.service;

import com.example.server.dto.request.BookingRequest;
import com.example.server.dto.response.BookingResponse;
import com.example.server.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookingService {
    List<BookingResponse> findByUser(User user);
    BookingResponse makeBooking(User user, BookingRequest bookingRequest);
}
