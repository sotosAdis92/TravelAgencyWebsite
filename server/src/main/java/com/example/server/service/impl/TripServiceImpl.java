package com.example.server.service.impl;

import com.example.server.dto.request.TripRequest;
import com.example.server.dto.response.CountryResponse;
import com.example.server.dto.response.TripResponse;
import com.example.server.entity.Continent;
import com.example.server.entity.Country;
import com.example.server.entity.Trip;
import com.example.server.mapper.TripMapper;
import com.example.server.repository.CountryRepository;
import com.example.server.repository.TripRepository;
import com.example.server.service.TripService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class TripServiceImpl implements TripService {

    private final TripMapper tripMapper;
    private final TripRepository tripRepository;
    private final CountryRepository countryRepository;

    public TripServiceImpl(TripMapper tripMapper, TripRepository tripRepository, CountryRepository countryRepository) {
        this.tripMapper = tripMapper;
        this.tripRepository = tripRepository;
        this.countryRepository = countryRepository;
    }

    @Override
    public List<TripResponse> getTripsByCountry(Long countryId) {
        List<TripResponse> trips = tripMapper.toDto(tripRepository.findAllByCountry_Id(countryId));
        return trips;
    }

    @Override
    public TripResponse createTrip(TripRequest tripRequest) {
        Country countryFromRequest = countryRepository.findById(tripRequest.countryId()).orElseThrow(() -> new RuntimeException("Could not find Continent with specified id " + tripRequest.countryId()));
        Trip trip = tripMapper.toEntity(tripRequest, countryFromRequest);
        return tripMapper.toDto(tripRepository.save(trip));
    }

    @Override
    public TripResponse updateTrip(TripRequest tripRequest,Long id) {
        Trip trip = tripRepository.findById(id).orElseThrow(() -> new RuntimeException("Could not find trip with an ID of: " + id));
        Country country = countryRepository.findById(tripRequest.countryId()).orElseThrow(() -> new RuntimeException("Could not find country with id of:" + id));
        trip.setCountry(country);


        return tripMapper.toDto(trip);
    }

    @Override
    public void deleteTrip(Long id) {
        Trip trip = tripRepository.findById(id).orElseThrow(() -> new RuntimeException("Trip not found with an id of: " + id));
        tripRepository.delete(trip);
    }
}
