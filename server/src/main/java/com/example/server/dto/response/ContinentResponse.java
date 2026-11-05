package com.example.server.dto.response;

import com.example.server.enums.ContinentNames;

public record ContinentResponse(
        Long id,
        ContinentNames name,
        int population,
        int landArea,
        String imageUrl,
        String mapUrl
) {
}
