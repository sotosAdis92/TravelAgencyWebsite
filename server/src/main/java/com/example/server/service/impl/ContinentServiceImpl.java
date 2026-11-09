package com.example.server.service.impl;

import com.example.server.dto.request.ContinentRequest;
import com.example.server.dto.response.ContinentResponse;
import com.example.server.entity.Continent;
import com.example.server.mapper.ContinentMapper;
import com.example.server.repository.ContinentRepository;
import com.example.server.service.ContinentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentServiceImpl implements ContinentService {
    private final ContinentRepository continentRepository;
    private final ContinentMapper continentMapper;

    public ContinentServiceImpl(ContinentRepository continentRepository, ContinentMapper continentMapper) {
        this.continentRepository = continentRepository;
        this.continentMapper = continentMapper;
    }

    @Override
    public List<ContinentResponse> getAllContinents() {
        List<ContinentResponse> continents = continentMapper.toDto(continentRepository.findAll());
        return continents;
    }
}
