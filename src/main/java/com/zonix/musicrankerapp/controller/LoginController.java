package com.zonix.musicrankerapp.controller;

import com.zonix.musicrankerapp.dto.LoginDto;
import com.zonix.musicrankerapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/login")
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;

    @GetMapping
    public String loginPage() {
        return "login";
    }

    @PostMapping
    public String login(Model model, @ModelAttribute("login") LoginDto loginDto) {
        return "redirect:/login";
    }
}
