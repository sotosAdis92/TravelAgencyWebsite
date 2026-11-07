package com.example.server.dto.response;

public record CountryResponse(
        Long id,
        String name,
        Long population,
        String imageUrl,
        String mapUrl
) {
}
