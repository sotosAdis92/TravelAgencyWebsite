package com.example.server.service.impl;

import com.example.server.dto.request.ContinentRequest;
import com.example.server.dto.response.ContinentResponse;
import com.example.server.entity.Continent;
import com.example.server.mapper.ContinentMapper;
import com.example.server.repository.ContinentRepository;
import com.example.server.service.ContinentService;
import org.springframework.stereotype.Service;

@Service
public class ContinentServiceImpl implements ContinentService {
    private final ContinentRepository continentRepository;
    private final ContinentMapper continentMapper;

    public ContinentServiceImpl(ContinentRepository continentRepository, ContinentMapper continentMapper) {
        this.continentRepository = continentRepository;
        this.continentMapper = continentMapper;
    }

    @Override
    public ContinentResponse createContinent(ContinentRequest continentRequest) {

       return null;
    }

    @Override
    public ContinentResponse updateContinent(ContinentRequest continentRequest, Long id) {
        Continent continent = continentRepository.findById(id).orElseThrow(() -> new RuntimeException("No Continent found with this id: " + id));
        continent.setName(continentRequest.name());
        continent.setPopulation(continentRequest.population());
        continent.setLandArea(continentRequest.landArea());
        continent.setImageUrl(continentRequest.imageUrl());
        continent.setMapUrl(continentRequest.mapUrl());
        continentRepository.save(continent);
        return continentMapper.toDto(continent);
    }

    @Override
    public void deleteContinent(Long id) {
        Continent continent = continentRepository.findById(id).orElseThrow(() -> new RuntimeException("No Continent Found with this id: " + id));
        continentRepository.delete(continent);
    }
}
