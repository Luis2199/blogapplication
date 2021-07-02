package com.itp.blogapp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class SignupController {
    
    @GetMapping("/signup")
    public String getRegisterForm(Model model) {
        return "registerForm";
    }    
}
