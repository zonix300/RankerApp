package com.zonix.musicrankerapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class HomeController {

    @GetMapping
    private String indexPage(){
        return "index";
    }
}
