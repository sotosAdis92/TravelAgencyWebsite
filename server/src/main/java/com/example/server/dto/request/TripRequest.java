package com.example.server.dto.request;

import com.example.server.enums.PhysicalConditions;
import com.example.server.enums.TripCategory;

import java.util.List;

public record TripRequest(
        String title,
        int duration,
        TripCategory tripCategory,
        int nights,
        PhysicalConditions physicalCondition,
        int cost,
        String description,
        String imageMap,
        String imageUrl,
        int capacity,
        List<ItineraryRequest> itineraries,
        List<DepartureRequest> departures,
        List<TripPictureRequest> tripPictures
) {
}
