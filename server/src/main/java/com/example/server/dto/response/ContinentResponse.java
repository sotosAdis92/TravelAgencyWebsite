package com.example.server.dto.response;

import com.example.server.enums.ContinentNames;

import java.util.List;

public record ContinentResponse(
        Long id,
        ContinentNames name,
        int population,
        int landArea,
        String imageUrl,
        String mapUrl,
        List<CountryResponse> countryList,
        Long countryCount
) {
}
