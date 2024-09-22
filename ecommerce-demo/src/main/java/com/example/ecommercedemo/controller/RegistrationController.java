package com.example.ecommercedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ecommercedemo.model.User;

@Controller
public class RegistrationController {
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "registration-form";
    }

    @PostMapping("/register")
    public String registerUser(User user, Model model) {
        // Here you would typically validate and save the user
        // For now, we'll just redirect to the main page
        return "redirect:/";
    }
}