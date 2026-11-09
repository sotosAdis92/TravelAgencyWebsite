package com.example.server.service;


import com.example.server.dto.request.TripRequest;
import com.example.server.dto.response.TripResponse;
import com.example.server.entity.Trip;

import java.util.List;
import java.util.Optional;

public interface TripService {
    List<TripResponse> getTripsByCountry(Long countryId);
}
