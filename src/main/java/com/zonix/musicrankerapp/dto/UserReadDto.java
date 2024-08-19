package com.zonix.musicrankerapp.dto;

import com.zonix.musicrankerapp.database.entity.Role;
import lombok.Value;

import java.time.LocalDate;

@Value
public class UserReadDto {
    Long id;
    String username;
    String email;
    String password;
    LocalDate dateJoined;
    LocalDate lastLogin;
    String profileInfo;
    Role role;
}
