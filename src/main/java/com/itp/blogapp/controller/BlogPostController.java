package com.itp.blogapp.controller;

import java.util.List;

import com.itp.blogapp.aid.ReadPosts;
import com.itp.blogapp.model.BlogPost;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BlogPostController {

	@GetMapping("/blogpost/{id}")
	public String getblogpost(@PathVariable int id, Model model) {
        List<BlogPost> posts = ReadPosts.readJson();
        model.addAttribute("post", posts.get(id));
        return "bpost";
    }   
    
    @GetMapping("/newPost")
    public String Form(Model model){
        model.addAttribute("blogPost", new BlogPost());
        return "postForm";
    }
}
