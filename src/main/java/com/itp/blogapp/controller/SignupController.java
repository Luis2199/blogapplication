package com.itp.blogapp.controller;

import java.util.List;

import com.itp.blogapp.aid.RWFile;
import com.itp.blogapp.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {
    
    @GetMapping("/signup")
    public String getRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "signUp";
    } 
    
    @PostMapping("/userAdded")
    public String newPost(@ModelAttribute User user){
        List<User> users = RWFile.readJsonUsers("users.json");
        int sizeNum = users.size() + 1;

        user.setId(sizeNum);
        RWFile.writeJsonUser(user, "users.json");
        return "redirect:/login";
    }
}
