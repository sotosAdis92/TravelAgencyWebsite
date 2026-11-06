package com.example.server.mapper.impl;

import com.example.server.dto.request.CountryRequest;
import com.example.server.dto.response.CountryResponse;
import com.example.server.dto.response.TripResponse;
import com.example.server.entity.Continent;
import com.example.server.entity.Country;
import com.example.server.entity.Trip;
import com.example.server.mapper.CountryMapper;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Component
public class CountryMapperImpl implements CountryMapper {
    @Override
    public Country toEntity(CountryRequest countryRequest, Continent continentById) {
        Country country = new Country(
            null,
            continentById,
            countryRequest.name(),
            countryRequest.population(),
            countryRequest.imageUrl(),
            countryRequest.mapUrl(),
            new ArrayList<>(),
            Instant.now(),
            Instant.now()
        );
        return country;
    }

    @Override
    public CountryResponse toDto(Country country) {
        CountryResponse countryResponse = new CountryResponse(
                country.getId(),
                country.getName(),
                country.getPopulation(),
                country.getImageUrl(),
                country.getMapUrl()
        );
        return countryResponse;
    }

    @Override
    public List<CountryResponse> toDto(List<Country> countries) {
        return countries.stream().map(this::toDto).toList();
    }

}
