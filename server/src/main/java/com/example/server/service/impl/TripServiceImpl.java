package com.example.server.service.impl;

import com.example.server.dto.response.CountryResponse;
import com.example.server.dto.response.TripResponse;
import com.example.server.mapper.TripMapper;
import com.example.server.repository.TripRepository;
import com.example.server.service.TripService;
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
    public List<TripResponse> getTripsByCountry(Long countryId) {
        List<TripResponse> trips = tripMapper.toDto(tripRepository.findAllByCountry_Id(countryId));
        return trips;
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
