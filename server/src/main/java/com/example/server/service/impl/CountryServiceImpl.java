package com.example.server.service.impl;

import com.example.server.dto.request.CountryRequest;
import com.example.server.dto.response.CountryResponse;
import com.example.server.entity.Continent;
import com.example.server.entity.Country;
import com.example.server.mapper.CountryMapper;
import com.example.server.repository.ContinentRepository;
import com.example.server.repository.CountryRepository;
import com.example.server.service.CountryService;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {
    private final ContinentRepository continentRepository;
    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;

    public CountryServiceImpl(ContinentRepository continentRepository, CountryRepository countryRepository, CountryMapper countryMapper) {
        this.continentRepository = continentRepository;
        this.countryRepository = countryRepository;
        this.countryMapper = countryMapper;
    }

    @Override
    public CountryResponse createCountry(CountryRequest countryRequest) {
        Continent continentFromRequest = continentRepository.findById(countryRequest.continentId()).orElseThrow(() -> new RuntimeException("Could not find Continent with specified id " + countryRequest.continentId()));
        Country country = countryMapper.toEntity(countryRequest, continentFromRequest);
        return countryMapper.toDto(countryRepository.save(country));
    }

    @Override
    public CountryResponse updateCountry(CountryRequest countryRequest, Long id) {
        return null;
    }

    @Override
    public void deleteCountry(Long id) {

    }
}
