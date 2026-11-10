package com.example.server.dto.response;

import com.example.server.dto.request.DepartureRequest;
import com.example.server.dto.request.ItineraryRequest;
import com.example.server.dto.request.TripPictureRequest;
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
        int capacity,
        List<ItineraryResponse> itineraries,
        List<DepartureResponse> departures,
        List<TripPictureResponse> tripPictures
) {
}
