package com.blog.blogsitesi.service.impl;

import com.blog.blogsitesi.entities.Comment;
import com.blog.blogsitesi.repository.CommentRepository;
import com.blog.blogsitesi.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;


    @Override
    public Comment create(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Comment update(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void deleteByID(Long id) {
        commentRepository.deleteById(id);

    }
}
