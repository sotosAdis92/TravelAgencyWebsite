package com.example.server.mapper.impl;

import com.example.server.dto.request.ContinentRequest;
import com.example.server.dto.response.ContinentResponse;
import com.example.server.dto.response.CountryResponse;
import com.example.server.entity.Continent;
import com.example.server.mapper.ContinentMapper;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ContinentMapperImpl implements ContinentMapper {
    @Override
    public Continent toEntity(ContinentRequest continentRequest) {
        Continent continent = new Continent(
                null,
                continentRequest.name(),
                continentRequest.population(),
                continentRequest.landArea(),
                continentRequest.imageUrl(),
                continentRequest.mapUrl(),
                new ArrayList<>(),
                0,
                Instant.now(),
                Instant.now()
        );
        return continent;
    }

    @Override
    public ContinentResponse toDto(Continent continent) {
        return new ContinentResponse(
                continent.getId(),
                continent.getName(),
                continent.getPopulation(),
                continent.getLandArea(),
                continent.getImageUrl(),
                continent.getMapUrl()
        );
    }

    @Override
    public List<ContinentResponse> toDto(List<Continent> continents) {
        return continents.stream().map(this::toDto).toList();
    }
}
