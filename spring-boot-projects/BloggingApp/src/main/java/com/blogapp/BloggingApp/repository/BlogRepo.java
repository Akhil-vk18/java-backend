package com.blogapp.BloggingApp.repository;

import com.blogapp.BloggingApp.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<Post,Integer> {

}
