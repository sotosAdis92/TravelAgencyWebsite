package com.example.server.service;

import com.example.server.dto.request.LoginRequest;
import com.example.server.dto.request.RegisterRequest;
import com.example.server.dto.response.LoginResponse;
import com.example.server.entity.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;

public interface UserService {
    User register(RegisterRequest registerRequest);
    LoginResponse login(LoginRequest loginRequest, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse);
    ResponseEntity<String> logout(HttpServletRequest httpServletRequest);
    User getUserFromUsername(String username);
}
