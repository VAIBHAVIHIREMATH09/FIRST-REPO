package com.kodBook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class navigationController {
    @GetMapping("/")
    public String index() {
    	return "index";   
    	}
    @GetMapping("/openSignUp")
    public String openSignUp() {
    	return "signUp";   
    	}
    @GetMapping("/openCreatePost")
    public String openCreatePost() {
    	return "CreatePost";   
    	}
}
