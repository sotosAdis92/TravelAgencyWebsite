package com.example.server.dto.request;

import com.example.server.entity.Departure;
import com.example.server.entity.Itinerary;
import com.example.server.entity.TripPicture;
import com.example.server.enums.PhysicalConditions;
import com.example.server.enums.TripCategory;

import java.util.List;

public record TripRequest(
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
        int capacity,
        List<Itinerary> itineraries,
        List<Departure> departures,
        List<TripPicture> tripPictures
) {
}
