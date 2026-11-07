package com.example.server.mapper;

import com.example.server.dto.request.TripRequest;
import com.example.server.dto.response.TripResponse;
import com.example.server.entity.Country;
import com.example.server.entity.Trip;

import java.util.List;

public interface TripMapper {
    Trip toEntity(TripRequest tripRequest, Country countryById);
    Trip toEntity(TripRequest tripRequest);
    TripResponse toDto(Trip trip);
    List<TripResponse> toDto(List<Trip> tripList);
}
