package com.blog.blogsitesi.service;

import com.blog.blogsitesi.entities.Blog;
import com.blog.blogsitesi.entities.Comment;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface CommentService {

    Comment create(Comment comment);

    Comment update(Comment comment);

    void deleteByID(Long id);
}
