package com.aiblog.controller;

import com.aiblog.model.Post;
import com.aiblog.repository.PostRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin

public class BlogController {

private final PostRepository repo;

public BlogController(PostRepository repo){

this.repo = repo;

}

@GetMapping("/posts")

public List<Post> getPosts(){

return repo.findAll();

}

}