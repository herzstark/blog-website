package com.blog.blogsitesi.controller;

import com.blog.blogsitesi.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
    @Autowired
    BlogService blogService;
/*
    @GetMapping("/blog/{id}")
    public ResponseEntity<BlogService> getBlogById(@PathVariable Long id){

    }
    */
}
