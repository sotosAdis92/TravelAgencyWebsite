package com.example.server.dto.response;

public record TripPictureResponse(
        Long id,
        Long tripId,
        String imageUrl
) {
}
