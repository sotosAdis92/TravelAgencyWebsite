package com.example.server.dto.response;

import com.example.server.enums.RoomType;

import java.time.LocalDate;
import java.time.LocalTime;

public record DepartureResponse(
        Long id,
        Long tripId,
        LocalDate date,
        String airport,
        LocalTime time,
        RoomType roomType
) {
}
