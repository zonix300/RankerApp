package com.zonix.musicrankerapp.dto;

import com.zonix.musicrankerapp.database.entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;
import lombok.experimental.FieldNameConstants;
import org.springframework.format.annotation.DateTimeFormat;
import validation.group.CreateAction;

import java.time.LocalDate;

@Value
@FieldNameConstants

public class UserCreateEditDto {
    String username;
    @Email
    String email;
    @NotBlank(groups = CreateAction.class)
    String password;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate dateJoined = LocalDate.now();
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate lastLogin;
    String profileInfo;
    Role role = Role.USER;
}
