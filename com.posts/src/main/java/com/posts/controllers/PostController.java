package com.posts.controllers;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.posts.entities.Post;
import com.posts.services.PostService;

@Controller
public class PostController {
        @Autowired
        PostService service;
        
        @PostMapping("/createPost")
        public String createPost(@RequestParam("caption")String caption,
     		   @RequestParam("photo")MultipartFile photo,
     		   Model model
        		) {
        	 Post post=new Post();
        	 post.setCaption(caption);
        	 try {
				post.setPhoto(photo.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	service.createPost(post);
        	 List<Post> allPosts=service.fetchAllPosts();
        	model.addAttribute("allPosts",allPosts);
        	return "newpost";
        }
        @GetMapping("/likePost")
        public String likePost(@RequestParam Long id,Model model) {
        	Post post=service.getPost(id);
        	post.setLike(post.getLike()+1);
        	service.createPost(post);
        	service.updateLikes();
        	
        	List<Post> allPosts=service.fetchAllPosts();
         	model.addAttribute("allPosts",allPosts);
         	return "posts";
        	
        }
        @GetMapping("/Posts")
        public String posts(Model model) {


        	List<Post> allPosts=service.fetchAllPosts();
         	model.addAttribute("allPosts",allPosts);
         	return "posts";
        	
        }
}
