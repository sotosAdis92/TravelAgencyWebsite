package com.example.server.entity;

import com.example.server.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Setter
@Getter
@Table(name = "users")
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String userRole;

    @Column(name = "created_at")
    private Instant createdAt;

    public User(Long id, String username, String password, String userRole, Instant createdAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userRole = userRole;
        this.createdAt = createdAt;
    }
}
