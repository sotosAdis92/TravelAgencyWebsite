package com.example.server.mapper.impl;

import com.example.server.dto.request.RegisterRequest;
import com.example.server.dto.response.RegisterResponse;
import com.example.server.entity.User;
import com.example.server.mapper.UsersMapper;

import java.time.Instant;


public class UsersMapperImpl implements UsersMapper {

    public User toEntity(RegisterRequest registerRequest){
        User user = new User(
                null,
                registerRequest.username(),
                registerRequest.password(),
                "ROLE_USER",
                Instant.now()
        );
        return user;
    }

    @Override
    public RegisterResponse toDto(User user) {
        RegisterResponse registerResponse = new RegisterResponse(user.getUsername());
        return registerResponse;
    }


}
