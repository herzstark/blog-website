package com.blog.blogsitesi.controller;

import com.blog.blogsitesi.dtos.UserLoginDTO;
import com.blog.blogsitesi.dtos.UserRegisterDTO;
import com.blog.blogsitesi.entities.User;
import com.blog.blogsitesi.mapper.user.RegisterDtoMapper;
import com.blog.blogsitesi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RegisterDtoMapper registerMapper;

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserByID(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getByID(id), HttpStatus.OK);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUserByID(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return new ResponseEntity<>(userService.update(user), HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id) {
        userService.deleteByID(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/user-register")
    public ResponseEntity<User> registerUser(@RequestBody UserRegisterDTO userRegisterDTO){
        User newUser = registerMapper.mapFrom(userRegisterDTO);
        return new ResponseEntity<>(userService.registerUser(newUser),HttpStatus.CREATED);
    }


    @PostMapping("/user-login")
    public ResponseEntity<User> loginUser(@RequestBody UserLoginDTO userLoginDTO){
        return new ResponseEntity<>(userService.loginUser(userLoginDTO.getUsername(), userLoginDTO.getPassword()),HttpStatus.OK);
    }


}
