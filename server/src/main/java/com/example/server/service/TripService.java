package com.example.server.service;


import com.example.server.dto.response.TripResponse;

import java.util.List;

public interface TripService {
    List<TripResponse> getTripsByCountry(Long countryId);
    TripResponse createTrip();
    TripResponse updateTrip(Long id);
    void deleteTrip(Long id);
}
