package com.blog.blogsitesi.service;

import com.blog.blogsitesi.entities.User;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface UserService {

    User getByID(Long id);

    User update(User user);

    void deleteByID(Long id);

    User registerUser(User user);

    User loginUser(String username, String password);
}
