package com.zonix.musicrankerapp.controller;

import com.zonix.musicrankerapp.dto.UserCreateEditDto;
import com.zonix.musicrankerapp.dto.UserReadDto;
import com.zonix.musicrankerapp.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/register")
@RequiredArgsConstructor
public class RegistrationController {

    private final UserService userService;

    @GetMapping
    public String registerPage() {
        return "/register";
    }

    @PostMapping
    public UserReadDto register(@Valid @ModelAttribute UserCreateEditDto userCreateEditDto) {
        return userService.create(userCreateEditDto);
    }

}
