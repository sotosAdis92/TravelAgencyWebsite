package com.example.server.dto.request;


public record CountryRequest(
        String name,
        int population,
        String imageUrl,
        String mapUrl,
        Long continentId
) {
}
