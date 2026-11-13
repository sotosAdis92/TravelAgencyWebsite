package com.example.server.service;

import com.example.server.dto.request.ContinentRequest;
import com.example.server.dto.response.ContinentResponse;
import com.example.server.entity.Continent;

import java.util.List;

public interface ContinentService {
    List<ContinentResponse> getAllContinents();
    ContinentResponse getContinentById(Long id);
}
