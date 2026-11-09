package com.example.server.dto.request;

import java.time.Instant;

public record BookingRequest(
        Long tripId,
        Long userId,
        Instant bookedAt
) {
}
