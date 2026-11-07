package com.example.server.dto.request;


public record CountryRequest(
        String name,
        Long population,
        String imageUrl,
        String mapUrl,
        Long continentId
) {
}
