package com.zonix.musicrankerapp.controller;

import com.zonix.musicrankerapp.dto.UserReadDto;
import com.zonix.musicrankerapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public String findAll(Model model) {
        List<UserReadDto> users = userService.findAll();
        model.addAttribute("users");
        return "users";
    }
}
