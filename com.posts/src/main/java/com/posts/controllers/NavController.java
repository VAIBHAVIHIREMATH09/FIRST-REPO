package com.posts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NavController {
   @GetMapping("/")
   public String newPost() {
	return "newPost";
	   
   }
}
