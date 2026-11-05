package com.example.server.dto.response;

public record ItineraryResponse(
        Long id,
        int dayNumber,
        String location,
        String description,
        String imageUrl
) {
}
