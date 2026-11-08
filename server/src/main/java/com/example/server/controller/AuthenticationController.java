package com.example.server.controller;

import com.example.server.dto.response.LoginResponse;
import com.example.server.dto.response.RegisterResponse;
import org.springframework.http.HttpStatus;
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
        LoginResponse loginResponse = new LoginResponse("Hello");
        return new ResponseEntity<>(loginResponse,HttpStatus.OK);
    }
    @PostMapping("/logout")
    public ResponseEntity<String> logout(){
        return null;
    }

}
