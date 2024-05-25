package com.blog.blogsitesi.service.impl;

import com.blog.blogsitesi.entities.User;
import com.blog.blogsitesi.repository.UserRepository;
import com.blog.blogsitesi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getByID(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if(userOptional.isEmpty())
            throw new RuntimeException();
        return userOptional.get();
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteByID(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User loginUser(String username, String password) {
        Optional<User> userOptional = userRepository.findByUsername(username);
        if(userOptional.isEmpty())
            throw new RuntimeException();
        if (!Objects.equals(userOptional.get().getPassword(), password))
            throw new RuntimeException();

        return userOptional.get();
    }

}
