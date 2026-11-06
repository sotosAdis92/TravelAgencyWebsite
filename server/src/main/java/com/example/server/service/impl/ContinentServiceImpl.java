package com.example.server.service.impl;

import com.example.server.dto.request.ContinentRequest;
import com.example.server.entity.Continent;
import com.example.server.repository.ContinentRepository;
import com.example.server.service.ContinentService;
import org.springframework.stereotype.Service;

@Service
public class ContinentServiceImpl implements ContinentService {
    private final ContinentRepository continentRepository;

    public ContinentServiceImpl(ContinentRepository continentRepository) {
        this.continentRepository = continentRepository;
    }

    @Override
    public Continent createContinent(ContinentRequest continentRequest) {
       return null;
    }

    @Override
    public Continent updateContinent(ContinentRequest continentRequest) {
        return null;
    }

    @Override
    public void deleteContinent(Long id) {
        Continent continent = continentRepository.findById(id).orElseThrow(() -> new RuntimeException("No Continent Found with this id: " + id));
        continentRepository.delete(continent);
    }
}
