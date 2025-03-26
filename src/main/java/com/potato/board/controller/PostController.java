package com.potato.board.controller;

import com.potato.board.domain.Post;
import com.potato.board.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    @GetMapping
    public List<Post> getPosts() {
        return postService.findAll();
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.save(post);
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
