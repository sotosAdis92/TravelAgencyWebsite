package com.example.server.dto.request;


import com.example.server.enums.ContinentNames;

import java.util.List;

public record ContinentRequest(
        ContinentNames name,
        int population,
        int landArea,
        String imageUrl,
        String mapUrl
) {
}
