package com.zonix.musicrankerapp.dto;

import com.zonix.musicrankerapp.database.entity.Role;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Value
public class UserCreateEditDto {
    Long id;
    String username;
    String email;
    String password;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate dateJoined;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate lastLogin;
    String profileInfo;
    Role role;
}
