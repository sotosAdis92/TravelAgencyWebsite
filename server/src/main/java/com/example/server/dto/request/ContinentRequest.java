package com.example.server.dto.request;


import com.example.server.enums.ContinentNames;

public record ContinentRequest(
        ContinentNames name,
        Long population,
        int landArea,
        String imageUrl,
        String mapUrl
) {
}
