package com.example.server.service;

import com.example.server.dto.request.ContinentRequest;
import com.example.server.entity.Continent;

public interface ContinentService {
    Continent createContinent(ContinentRequest continentRequest);
}
