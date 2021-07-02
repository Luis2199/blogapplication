package com.itp.blogapp.controller;

// import java.io.FileInputStream;
// import java.io.IOException;
// import java.io.InputStream;

// import javax.json.Json;
// import javax.json.JsonObject;
// import javax.json.JsonReader;

import com.itp.blogapp.model.BlogPost;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BlogPostController {

	@GetMapping("/blogpost")
	public BlogPost getblogpost(Model model) {
        BlogPost blogpost = new BlogPost();
        model.addAttribute("post", blogpost);
        return blogpost;
    }   
    
    @GetMapping("/newPost")
    public String Form(Model model){
        model.addAttribute("blogPost", new BlogPost());
        return "postForm";
    }
}
