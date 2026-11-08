package com.example.server.service;

import com.example.server.dto.request.LoginRequest;
import com.example.server.dto.request.RegisterRequest;
import com.example.server.dto.response.LoginResponse;
import com.example.server.dto.response.RegisterResponse;
import com.example.server.entity.User;

public interface UserService {
    RegisterResponse register(RegisterRequest registerRequest);
    LoginResponse login(LoginRequest loginRequest);
}
