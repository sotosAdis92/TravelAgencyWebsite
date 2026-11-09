package com.example.server.service.impl;

import com.example.server.dto.request.TripRequest;
import com.example.server.dto.response.TripResponse;
import com.example.server.entity.Country;
import com.example.server.entity.Trip;
import com.example.server.exception.CountryNotFoundException;
import com.example.server.exception.TripNotFoundException;
import com.example.server.mapper.TripMapper;
import com.example.server.repository.CountryRepository;
import com.example.server.repository.TripRepository;
import com.example.server.service.TripService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

}
