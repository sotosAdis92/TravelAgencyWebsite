package com.example.server.controller;

import com.example.server.dto.request.ContinentRequest;
import com.example.server.dto.response.ContinentResponse;
import com.example.server.service.ContinentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/continent")
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

    @PostMapping
    public ResponseEntity<ContinentResponse> createContinent(@RequestBody ContinentRequest continent){
        ContinentResponse continentResponse = continentService.createContinent(continent);
        return new ResponseEntity<>(continentResponse,HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContinentResponse> updateContinent(ContinentRequest continent, @PathVariable("id") Long id){
        ContinentResponse continentResponse = continentService.updateContinent(continent, id);
        return new ResponseEntity<>(continentResponse, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteContinent(@PathVariable("id") Long id){
        continentService.deleteContinent(id);
        return new ResponseEntity<>("Deleted the continent with an id of:" + id, HttpStatus.OK);
    }
}
