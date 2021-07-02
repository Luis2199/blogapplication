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

    // public BlogPost readBlogPost() throws IOException {
    //     InputStream fis = new FileInputStream("../database/posts.json");

    //     // create JsonReader object
    //     JsonReader jsonReader = Json.createReader(fis);

    //     // get JsonObject from JsonReader
    //     JsonObject jsonObject = jsonReader.readObject();

    //     // we can close IO resource and JsonReader now
    //     jsonReader.close();
    //     fis.close();

    //     // Retrieve data from JsonObject and create Post bean
    //     BlogPost post = new BlogPost();
    //     post.setId(jsonObject.getInt("id"));
    //     post.setTitle(jsonObject.getString("title"));
    //     post.setIntroduction(jsonObject.getString("introduction"));
    //     post.setParagraph1(jsonObject.getString("paragraph1"));
    //     post.setParagraph2(jsonObject.getString("paragraph2"));
    //     post.setParagraph3(jsonObject.getString("paragraph3"));
    //     post.setConclusion(jsonObject.getString("conclusion"));
    //     post.setUsername(jsonObject.getString("introduction"));
    //     post.setDate(jsonObject.getString("date"));
    //     return post;
    // }
}
