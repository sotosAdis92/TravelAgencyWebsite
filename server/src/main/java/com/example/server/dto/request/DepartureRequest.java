package com.example.server.dto.request;

import com.example.server.enums.RoomType;

import java.time.LocalDate;
import java.time.LocalTime;

public record DepartureRequest(
        LocalDate date,
        String airport,
        LocalTime time,
        RoomType roomType
) {
}
