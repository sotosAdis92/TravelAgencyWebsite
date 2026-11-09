package com.example.server.service.impl;

import com.example.server.dto.request.LoginRequest;
import com.example.server.dto.request.RegisterRequest;
import com.example.server.dto.response.LoginResponse;
import com.example.server.entity.User;
import com.example.server.repository.UserRepository;
import com.example.server.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.security.web.context.SecurityContextRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private SecurityContextRepository securityContextRepository;

    @Override
    public User register(RegisterRequest registerRequest) {
        if(userRepository.existsByUsername(registerRequest.username())){
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
        User user = User.builder().username(registerRequest.username()).password(passwordEncoder.encode(registerRequest.password())).userRole("ROLE_USER").build();
        return userRepository.save(user);
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.username(), loginRequest.password()));
        HttpSession existing = httpServletRequest.getSession(false);
        if(existing != null){
            existing.invalidate();
        }
        httpServletRequest.getSession(true);
        SecurityContext securityContext = SecurityContextHolder.getContext();
        securityContext.setAuthentication(authentication);
        securityContextRepository.saveContext(securityContext,httpServletRequest,httpServletResponse);
        LoginResponse loginResponse = new LoginResponse(loginRequest.username());
        return loginResponse;
    }

    @Override
    public ResponseEntity<String> logout(HttpServletRequest httpServletRequest) {
        HttpSession httpSession = httpServletRequest.getSession(false);
        if(httpSession!=null){
            httpSession.invalidate();
        }
        SecurityContextHolder.clearContext();
        ResponseCookie jsessionCookie = ResponseCookie.from("JSESSIONID","").maxAge(0).path("/").httpOnly(true).sameSite("Strict").build();
        ResponseCookie xsrfToken = ResponseCookie.from("XSRF-TOKEN","").maxAge(0).path("/").build();
        return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, jsessionCookie.toString()).header(HttpHeaders.SET_COOKIE, xsrfToken.toString()).body("Logged out");
    }

    @Override
    public User getUserFromUsername(String username) {
        return userRepository.getUserByUsername(username);
    }


}
