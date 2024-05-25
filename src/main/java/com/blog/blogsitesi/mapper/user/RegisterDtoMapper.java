package com.blog.blogsitesi.mapper.user;

import com.blog.blogsitesi.dtos.UserRegisterDTO;
import com.blog.blogsitesi.entities.User;
import com.blog.blogsitesi.mapper.Mapper;
import org.springframework.stereotype.Component;

@Component
public class RegisterDtoMapper extends Mapper<User, UserRegisterDTO> {

    @Override
    public UserRegisterDTO mapTo(User user) {
        return modelMapper.map(user,UserRegisterDTO.class);
    }

    @Override
    public User mapFrom(UserRegisterDTO userRegisterDTO) {
        return modelMapper.map(userRegisterDTO,User.class);
    }
}


