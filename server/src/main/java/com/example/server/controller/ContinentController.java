package com.example.server.controller;

import com.example.server.dto.response.ContinentResponse;
import com.example.server.service.ContinentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/continents")
public class ContinentController {
    private final ContinentService continentService;

    public ContinentController(ContinentService continentService) {
        this.continentService = continentService;
    }

    @GetMapping
    public ResponseEntity<List<ContinentResponse>> getAllContinents(){
        List<ContinentResponse> continents = continentService.getAllContinents();
        return new ResponseEntity<>(continents, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContinentResponse> getContinentById(@PathVariable("id") Long id){
        ContinentResponse continentResponse = continentService.getContinentById(id);
        return new ResponseEntity<>(continentResponse, HttpStatus.OK);
    }
}
