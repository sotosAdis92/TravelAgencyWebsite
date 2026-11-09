package com.example.server.mapper;

import com.example.server.dto.request.BookingRequest;
import com.example.server.dto.response.BookingResponse;
import com.example.server.entity.Booking;
import com.example.server.entity.Trip;
import com.example.server.entity.User;

import java.util.List;

public interface BookingMapper {
    Booking toEntity(BookingRequest bookingRequest, Trip tripById, User userById);
    BookingResponse toDto(Booking booking);
    List<BookingResponse> toDto(List<Booking> bookings);
}
