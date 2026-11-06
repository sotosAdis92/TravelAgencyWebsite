package com.example.server.service;

import com.example.server.dto.request.CountryRequest;
import com.example.server.dto.response.CountryResponse;

import java.util.List;

public interface CountryService {
    List<CountryResponse> getAllCounties();
    CountryResponse createCountry(CountryRequest countryRequest);
    CountryResponse updateCountry(CountryRequest countryRequest, Long id);
    void deleteCountry(Long id);
}
