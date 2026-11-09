package com.example.server.dto.response;

import com.example.server.enums.PhysicalConditions;
import com.example.server.enums.TripCategory;

import java.util.List;

public record TripResponse(
        Long id,
        Long countryId,
        String title,
        int duration,
        TripCategory tripCategory,
        int nights,
        PhysicalConditions physicalCondition,
        int cost,
        String description,
        String imageMap,
        String imageUrl,
        int capacity
) {
}
