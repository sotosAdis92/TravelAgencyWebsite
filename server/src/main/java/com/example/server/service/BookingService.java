package com.example.server.service;

import com.example.server.dto.response.BookingResponse;
import com.example.server.entity.User;

import java.util.List;

public interface BookingService {
    List<BookingResponse> findByUser(User user);
}
