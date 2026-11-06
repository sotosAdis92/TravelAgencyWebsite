package com.example.server.service.impl;

import com.example.server.dto.response.TripResponse;
import com.example.server.service.TripService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripServiceImpl implements TripService {
    @Override
    public List<TripResponse> getTripsByCountry(Long countryId) {
        return List.of();
    }

    @Override
    public TripResponse createTrip() {
        return null;
    }

    @Override
    public TripResponse updateTrip(Long id) {
        return null;
    }

    @Override
    public void deleteTrip(Long id) {

    }
}
