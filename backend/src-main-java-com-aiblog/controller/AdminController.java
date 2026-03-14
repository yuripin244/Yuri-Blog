package com.aiblog.controller;

import com.aiblog.model.Post;
import com.aiblog.repository.PostRepository;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")

public class AdminController {

private final PostRepository repo;

public AdminController(PostRepository repo){

this.repo = repo;

}

@PostMapping("/create")

public Post createPost(@RequestBody Post post){

return repo.save(post);

}

}