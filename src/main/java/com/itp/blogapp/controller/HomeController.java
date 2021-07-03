package com.itp.blogapp.controller;

import java.util.List;
import java.util.Collections;

import com.itp.blogapp.aid.ReadPosts;
import com.itp.blogapp.model.BlogPost;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String displayHome(Model model) {
        List<BlogPost> posts = ReadPosts.readJson();
        Collections.reverse(posts);
        model.addAttribute("posts", posts);
        return "index";
    }

}
 