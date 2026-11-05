package com.example.server.mapper;

import com.example.server.dto.request.ContinentRequest;
import com.example.server.dto.response.ContinentResponse;
import com.example.server.entity.Continent;

import java.util.List;

public interface ContinentMapper {
    Continent toEntity(ContinentRequest continentRequest);
    ContinentResponse toDto(Continent continent);
    List<ContinentResponse> toDto(List<Continent> continents);
}
