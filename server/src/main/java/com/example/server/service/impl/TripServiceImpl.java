package com.example.server.service.impl;

import com.example.server.dto.response.TripResponse;
import com.example.server.enums.TripCategory;
import com.example.server.exception.TripNotFoundException;
import com.example.server.mapper.TripMapper;
import com.example.server.repository.TripRepository;
import com.example.server.service.TripService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TripServiceImpl implements TripService {

    private final TripMapper tripMapper;
    private final TripRepository tripRepository;

    public TripServiceImpl(TripMapper tripMapper, TripRepository tripRepository) {
        this.tripMapper = tripMapper;
        this.tripRepository = tripRepository;
    }


    @Override
    public Page<TripResponse> getTripsByCountryName(String countryName, double costMin, double costMax, String category, double durationMin, double durationMax, Pageable pageable) {
        TripCategory tripCategory = TripCategory.valueOf(category);
        Page<TripResponse> trips = tripMapper.toDto(tripRepository.filterTrips(countryName, costMin, costMax, tripCategory, durationMin, durationMax));
        return trips;
    }

    @Override
    public TripResponse findById(Long Id) {
        return tripMapper.toDto(tripRepository.findById(Id).orElseThrow(() -> new TripNotFoundException("Trip with this id not found")));
    }

}
