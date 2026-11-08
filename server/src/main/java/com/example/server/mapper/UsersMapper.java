package com.example.server.mapper;

import com.example.server.dto.request.RegisterRequest;
import com.example.server.dto.response.RegisterResponse;
import com.example.server.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UsersMapper {
    User toEntity(RegisterRequest registerRequest);
    RegisterResponse toDto(User user);
}
