package com.blog.blogsitesi.service.impl;

import com.blog.blogsitesi.entities.Blog;
import com.blog.blogsitesi.entities.User;
import com.blog.blogsitesi.repository.BlogRepository;
import com.blog.blogsitesi.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public Blog getByID(Long id) {
        Optional<Blog> blogOptional = blogRepository.findById(id);
        if (blogOptional.isEmpty())
            throw new RuntimeException();
        return blogOptional.get();
    }

    @Override
    public Blog update(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public void deleteByID(Long id) {
        blogRepository.deleteById(id);

    }
}
