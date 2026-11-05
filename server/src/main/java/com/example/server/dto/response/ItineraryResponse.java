package com.example.server.dto.response;

public record ItineraryResponse(
        Long id,
        Long tripId,
        int dayNumber,
        String location,
        String description,
        String imageUrl
) {
}
