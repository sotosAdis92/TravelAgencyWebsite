package com.example.server.service;


import com.example.server.dto.response.TripResponse;

import java.util.List;

public interface TripService {
    List<TripResponse> getTripsByCountryName(String countryName);
    TripResponse findById(Long Id);
}
