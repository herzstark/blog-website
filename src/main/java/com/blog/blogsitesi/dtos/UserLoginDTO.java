package com.blog.blogsitesi.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.processing.Pattern;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserLoginDTO {

    @NotNull
    private String username;

    @NotNull
    private String password;
}
