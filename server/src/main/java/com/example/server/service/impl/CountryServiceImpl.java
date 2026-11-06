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

import java.time.Instant;
import java.util.List;

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
    public List<CountryResponse> getAllCounties(Long continentId) {
        List<CountryResponse> countries = countryMapper.toDto(countryRepository.findCountriesByContinent_Id(continentId));
        return countries;
    }

    @Override
    public CountryResponse createCountry(CountryRequest countryRequest) {
        Continent continentFromRequest = continentRepository.findById(countryRequest.continentId()).orElseThrow(() -> new RuntimeException("Could not find Continent with specified id " + countryRequest.continentId()));
        Country country = countryMapper.toEntity(countryRequest, continentFromRequest);
        return countryMapper.toDto(countryRepository.save(country));
    }

    @Override
    public CountryResponse updateCountry(CountryRequest countryRequest, Long id) {
        Country country = countryRepository.findById(id).orElseThrow(() -> new RuntimeException("Could not find country with an ID of: " + id));
        Continent continent = continentRepository.findById(countryRequest.continentId()).orElseThrow(() -> new RuntimeException("Could not find continent with id of:" + id));
        country.setContinent(continent);
        country.setName(countryRequest.name());
        country.setPopulation(countryRequest.population());
        country.setImageUrl(countryRequest.imageUrl());
        country.setMapUrl(countryRequest.imageUrl());
        country.setUpdated_at(Instant.now());
        return countryMapper.toDto(country);
    }

    @Override
    public void deleteCountry(Long id) {
        Country country = countryRepository.findById(id).orElseThrow(() -> new RuntimeException("Could not find country with that id:" + id));
        countryRepository.delete(country);
    }
}
