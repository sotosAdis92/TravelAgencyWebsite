package com.example.server.dto.request;

import java.util.List;

public record CountryRequest(
        String name,
        int population,
        String imageUrl,
        String mapUrl,
        List<TripRequest> trips
) {
}
