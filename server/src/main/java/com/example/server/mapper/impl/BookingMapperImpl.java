package com.example.server.mapper.impl;

import com.example.server.dto.request.BookingRequest;
import com.example.server.dto.response.BookingResponse;
import com.example.server.entity.Booking;
import com.example.server.entity.Trip;
import com.example.server.entity.User;
import com.example.server.mapper.BookingMapper;

import java.time.Instant;
import java.util.List;

public class BookingMapperImpl implements BookingMapper {
    @Override
    public Booking toEntity(BookingRequest bookingRequest,Trip tripById, User userById) {
        Booking booking = new Booking(
                null,
                tripById,
                userById,
                Instant.now()

        );
        return booking;
    }

    @Override
    public BookingResponse toDto(Booking booking) {
        BookingResponse bookingResponse = new BookingResponse(
                booking.getId(),
                booking.getTrip().getId(),
                booking.getUser().getId(),
                booking.getBookedAt()
        );
        return bookingResponse;
    }

    @Override
    public List<BookingResponse> toDto(List<Booking> bookings) {
        return bookings.stream().map(this::toDto).toList();
    }
}
