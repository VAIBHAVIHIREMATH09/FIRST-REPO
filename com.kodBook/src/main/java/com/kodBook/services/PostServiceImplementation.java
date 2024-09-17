package com.kodBook.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodBook.entities.Post;
import com.kodBook.repositories.PostRepository;

@Service
public class PostServiceImplementation implements PostService{
     @Autowired
     PostRepository repo;

	public void createPost(Post post) {
		repo.save(post);
		
	}

	

	
}
