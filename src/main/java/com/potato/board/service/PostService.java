package com.potato.board.service;

import com.potato.board.domain.Post;
import com.potato.board.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Transactional
    public Post save(Post post) {
        return postRepository.save(post);
    }
}
