package com.blog.blogsitesi.controller;

import com.blog.blogsitesi.entities.Blog;
import com.blog.blogsitesi.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("/blog/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable Long id){
        return new ResponseEntity<>(blogService.getByID(id), HttpStatus.OK);
    }

    @PostMapping("/blog")
    public ResponseEntity<Blog> createBlog(@RequestBody Blog blog){
        return new ResponseEntity<>(blogService.createBlog(blog),HttpStatus.CREATED);
    }

    @PutMapping("/blog/{id}")
    public ResponseEntity<Blog> updateBlog(@PathVariable Long id,@RequestBody Blog blog){
        blog.setId(id);
        return new ResponseEntity<>(blogService.update(blog),HttpStatus.OK);
    }

    @DeleteMapping("/blog/{id}")
    public ResponseEntity deleteBlog(@PathVariable Long id){
        blogService.deleteByID(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
