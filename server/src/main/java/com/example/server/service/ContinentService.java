package com.example.server.service;

import com.example.server.dto.request.ContinentRequest;
import com.example.server.dto.response.ContinentResponse;
import com.example.server.entity.Continent;

public interface ContinentService {
    ContinentResponse createContinent(ContinentRequest continentRequest);
    ContinentResponse updateContinent(ContinentRequest continentRequest, Long id);
    void deleteContinent(Long id);
}
