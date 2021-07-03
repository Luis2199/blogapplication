package com.itp.blogapp.aid;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itp.blogapp.model.BlogPost;

public class WritePost {
    
    public static void writeJson(BlogPost post) {
        
        try{
            List<BlogPost> allPosts = ReadPosts.readJson();
            allPosts.add(post);

            File file = new File("src/main/java/com/itp/blogapp/database/posts.json");

            ObjectMapper mapper = new ObjectMapper();

            mapper.writeValue(file, allPosts);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
