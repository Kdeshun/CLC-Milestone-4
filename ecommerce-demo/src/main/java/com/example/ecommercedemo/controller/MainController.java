package com.example.ecommercedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("title", "E-Commerce Application");
        // Add username if applicable, e.g., if using session attributes
        // model.addAttribute("username", someUsernameValue);
        return "main"; // This should match the name of your HTML template
    }
}