package com.example.resume1.resume1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class resume {
    @GetMapping("/resume")
    public String Resume(Model model){
        model.addAttribute("Resume",new resume());
        return "index";
    }
}
