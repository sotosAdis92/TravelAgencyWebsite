package com.example.server.service.impl;

import com.example.server.dto.request.LoginRequest;
import com.example.server.dto.request.RegisterRequest;
import com.example.server.entity.User;
import com.example.server.repository.UserRepository;
import com.example.server.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User register(RegisterRequest registerRequest) {
        if(userRepository.existsByUsername(registerRequest.username())){
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
        User user = User.builder().username(registerRequest.username()).password(passwordEncoder.encode(registerRequest.password())).userRole("ROLE_USER").build();
        return userRepository.save(user);
    }

    @Override
    public User login(LoginRequest loginRequest, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        return null;
    }


}
