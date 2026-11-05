package com.example.server.dto.request;

public record ItineraryRequest(
        int dayNumber,
        String location,
        String description,
        String imageUrl
) {
}
