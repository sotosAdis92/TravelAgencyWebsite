package com.example.server.dto.response;

public record CountryResponse(
        Long id,
        String name,
        int population,
        String imageUrl,
        String mapUrl
) {
}
