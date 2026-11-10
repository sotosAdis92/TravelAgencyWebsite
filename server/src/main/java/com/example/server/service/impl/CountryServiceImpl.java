package com.example.server.service.impl;

import com.example.server.dto.request.CountryRequest;
import com.example.server.dto.response.CountryResponse;
import com.example.server.entity.Continent;
import com.example.server.entity.Country;
import com.example.server.enums.ContinentNames;
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
    public List<CountryResponse> getAllCountriesByContinent(String continent) {
        ContinentNames name = ContinentNames.valueOf(continent);
        return countryMapper.toDto(countryRepository.findCountriesByContinent_Name(name));
    }
}
