package com.example.server.service;

import com.example.server.dto.request.LoginRequest;
import com.example.server.dto.request.RegisterRequest;
import com.example.server.entity.User;

public interface UserService {
    User register(RegisterRequest registerRequest);
    User login(LoginRequest loginRequest);
}
