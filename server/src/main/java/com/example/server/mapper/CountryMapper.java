package com.example.server.mapper;

import com.example.server.dto.request.CountryRequest;
import com.example.server.dto.response.CountryResponse;
import com.example.server.entity.Continent;
import com.example.server.entity.Country;

import java.util.List;

public interface CountryMapper {
    Country toEntity(CountryRequest countryRequest, Continent continentById);
    CountryResponse toDto(Country country);
    List<CountryResponse> toDto(List<Country> countries);
}
