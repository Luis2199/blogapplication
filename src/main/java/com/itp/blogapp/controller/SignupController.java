package com.itp.blogapp.controller;

import com.itp.blogapp.model.User;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class SignupController {
    
    @GetMapping("/signup")
    public String getRegisterForm(Model model) {
        // create new BlogUser instance and pass it to registerForm view template
        User blogUser = new User(1, "luis", "luiscarlos2106@hotmail.com", "Hola1234");
        model.addAttribute("blogUser", blogUser);
        return "registerForm";
    }    
}
