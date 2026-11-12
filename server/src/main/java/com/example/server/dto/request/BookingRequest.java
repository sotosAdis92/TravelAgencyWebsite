package com.example.server.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.Instant;

public record BookingRequest(
        @NotNull(message = "Trip needed to make a booking")
        @Positive(message = "Trip id must be positive")
        Long tripId,
        @NotNull(message = "User needed to make a booking")
        @Positive(message = "User id must be positive")
        Long userId,
        Instant bookedAt
) {
}
