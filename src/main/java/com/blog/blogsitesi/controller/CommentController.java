package com.blog.blogsitesi.controller;

import com.blog.blogsitesi.entities.Comment;
import com.blog.blogsitesi.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @PutMapping("/comment/{id}")
    public ResponseEntity<Comment> updateComment(@PathVariable Long id, @RequestBody Comment comment){
        comment.setId(id);
        return new ResponseEntity<>(commentService.update(comment), HttpStatus.OK);
    }

    @DeleteMapping("/comment/{id}")
    public ResponseEntity deleteComment(@PathVariable Long id){
        commentService.deleteByID(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/comment")
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment){
        return new ResponseEntity<Comment>(commentService.create(comment),HttpStatus.CREATED);
    }
}
