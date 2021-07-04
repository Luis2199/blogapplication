package com.itp.blogapp.controller;

import java.time.LocalDate;
import java.util.List;

import com.itp.blogapp.aid.RWFile;
import com.itp.blogapp.model.BlogPost;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BlogPostController {

	@GetMapping("/blogpost/{id}")
	public String getblogpost(@PathVariable int id, Model model) {
        String view = "bpost";
        List<BlogPost> posts = RWFile.readJson("posts.json");
        if(posts.size()>=id){
            model.addAttribute("post", posts.get(id-1));
        }else{
            view = "error";
        }
        return view;
    }   
    
    @GetMapping("/newPost")
    public String newPost(Model model){
        model.addAttribute("blogPost", new BlogPost());
        return "myNewPost";
    }

    @PostMapping("/postAdded")
    public String newPost(@ModelAttribute BlogPost post){
        List<BlogPost> posts = RWFile.readJson("posts.json");
        int sizeNum = posts.size() + 1;

        post.setId(sizeNum);
        post.setUsername("Anonymus");
        LocalDate date = LocalDate.now();
        post.setDate(""+date);

        RWFile.writeJson(post, "posts.json");
        return "redirect:/";
    }


}
