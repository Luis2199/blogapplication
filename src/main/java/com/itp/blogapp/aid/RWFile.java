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
import com.itp.blogapp.model.User;

public class RWFile {

    public static List<BlogPost> readJson(String fileName) {
        List<BlogPost> allPosts = null;
        
        try{
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = new FileInputStream(new File("src/main/java/com/itp/blogapp/database/" + fileName));
            TypeReference<List<BlogPost>> typeReference = new TypeReference<List<BlogPost>>(){};
            allPosts = mapper.readValue(inputStream, typeReference);
            inputStream.close();
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

    public static void writeJson(BlogPost post, String fileName) {
        
        try{
            List<BlogPost> allPosts = readJson(fileName);
            allPosts.add(post);

            File file = new File("src/main/java/com/itp/blogapp/database/"+fileName);

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

    public static List<User> readJsonUsers(String fileName) {
        List<User> allUsers = null;
        
        try{
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = new FileInputStream(new File("src/main/java/com/itp/blogapp/database/" + fileName));
            TypeReference<List<User>> typeReference = new TypeReference<List<User>>(){};
            allUsers = mapper.readValue(inputStream, typeReference);
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allUsers;
    }

    public static void writeJsonUser(User user, String fileName) {
        
        try{
            List<User> allUsers = readJsonUsers(fileName);
            allUsers.add(user);

            File file = new File("src/main/java/com/itp/blogapp/database/" + fileName);

            ObjectMapper mapper = new ObjectMapper();

            mapper.writeValue(file, allUsers);


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
