package com.blog.blogsitesi.service;

import com.blog.blogsitesi.entities.Blog;
import com.blog.blogsitesi.entities.User;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface BlogService {

    Blog getByID(Long id);

    Blog update(Blog blog);

    void deleteByID(Long id);

    Blog createBlog(Blog blog);
}
