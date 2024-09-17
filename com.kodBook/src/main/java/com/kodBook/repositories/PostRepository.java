package com.kodBook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodBook.entities.Post;

public interface PostRepository extends JpaRepository<Post,Long>{

}
