package com.zonix.musicrankerapp.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "users")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String username;

    private String email;

    private String password;

    private LocalDate dateJoined;

    private LocalDate lastLogin;

    private String profileInfo;

    @Enumerated(EnumType.STRING)
    private Role role;
}
