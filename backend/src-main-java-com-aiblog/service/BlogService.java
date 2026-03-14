package com.aiblog.service;

import com.aiblog.model.Post;
import com.aiblog.repository.PostRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    private final PostRepository postRepository;

    public BlogService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

}