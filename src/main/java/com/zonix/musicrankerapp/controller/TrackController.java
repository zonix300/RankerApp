package com.zonix.musicrankerapp.controller;

import com.zonix.musicrankerapp.service.TrackService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tracks")
@RequiredArgsConstructor
public class TrackController {

    private final TrackService trackService;

    @GetMapping
    public String findAll(Model model) {
        var tracks = trackService.findAll();

        model.addAttribute("tracks", tracks);
        return "tracks";
    }

}
