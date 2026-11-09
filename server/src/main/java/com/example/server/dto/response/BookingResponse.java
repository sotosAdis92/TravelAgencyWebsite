package com.example.server.dto.response;

import java.time.Instant;

public record BookingResponse(
        Long id,
        Long tripId,
        Long userId,
        Instant bookedAt
) {
}
