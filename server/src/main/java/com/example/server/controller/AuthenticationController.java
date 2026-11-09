package com.example.server.controller;

import com.example.server.dto.request.LoginRequest;
import com.example.server.dto.request.RegisterRequest;
import com.example.server.dto.response.LoginResponse;
import com.example.server.dto.response.RegisterResponse;
import com.example.server.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AuthenticationController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest registerRequest){
        userService.register(registerRequest);
        return new ResponseEntity<>(new RegisterResponse(registerRequest.username()),HttpStatus.CREATED);
    }
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        LoginResponse loginResponse = userService.login(loginRequest,httpServletRequest,httpServletResponse);
        return new ResponseEntity<>(loginResponse,HttpStatus.OK);
    }
    @PostMapping("/logout")
    public ResponseEntity<String> logout(){
        return null;
    }

}
