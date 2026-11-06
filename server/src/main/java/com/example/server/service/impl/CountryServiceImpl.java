package com.example.server.service.impl;

import com.example.server.dto.request.CountryRequest;
import com.example.server.dto.response.CountryResponse;
import com.example.server.mapper.CountryMapper;
import com.example.server.repository.CountryRepository;
import com.example.server.service.CountryService;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;

    public CountryServiceImpl(CountryRepository countryRepository, CountryMapper countryMapper) {
        this.countryRepository = countryRepository;
        this.countryMapper = countryMapper;
    }

    @Override
    public CountryResponse createCountry(CountryRequest countryRequest) {
        return null;
    }

    @Override
    public CountryResponse updateCountry(CountryRequest countryRequest, Long id) {
        return null;
    }

    @Override
    public void deleteCountry(Long id) {

    }
}
