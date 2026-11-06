package com.example.server.service.impl;

import com.example.server.dto.request.ContinentRequest;
import com.example.server.entity.Continent;
import com.example.server.repository.ContinentRepository;
import com.example.server.service.ContinentService;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class ContinentServiceImpl implements ContinentService {
    private final ContinentRepository continentRepository;

    public ContinentServiceImpl(ContinentRepository continentRepository) {
        this.continentRepository = continentRepository;
    }

    @Override
    public Continent createContinent(ContinentRequest continentRequest) {
        Instant now = Instant.now();
        Continent continent = new Continent(
               null,
                continentRequest.name(),
                continentRequest.population(),
                continentRequest.landArea(),
                continentRequest.imageUrl(),
                continentRequest.mapUrl(),
                continentRequest.countries(),
                now,
                now
        );
        return continentRepository.save(continent);
    }
}
