package com.itp.blogapp.aid;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itp.blogapp.model.BlogPost;

public class ReadPosts {
    // public static void main( String[] args){
    //     List<BlogPost> posts = readJson();
    //     for (BlogPost p : posts){
    //         System.out.println(p.getTitle());
    //     }
    // }

    public static List<BlogPost> readJson() {
        List<BlogPost> allPosts = null;
        
        try{
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = new FileInputStream(new File("src/main/java/com/itp/blogapp/database/posts.json"));
            TypeReference<List<BlogPost>> typeReference = new TypeReference<List<BlogPost>>(){};
            allPosts = mapper.readValue(inputStream, typeReference);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allPosts;
    }
    
}
