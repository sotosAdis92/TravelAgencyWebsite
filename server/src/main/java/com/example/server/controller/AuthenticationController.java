package com.example.server.controller;

import com.example.server.dto.response.LoginResponse;
import com.example.server.dto.response.RegisterResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AuthenticationController {

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(){
        return null;
    }
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(){
        return null;
    }
    @PostMapping("/logout")
    public ResponseEntity<String> logout(){
        return null;
    }

}
