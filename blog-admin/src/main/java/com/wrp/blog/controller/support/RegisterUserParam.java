package com.wrp.blog.controller.support;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * @author wrp
 * @since 2024-09-08 21:46
 **/
@Data
public class RegisterUserParam {
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @NotEmpty(message = "密码不能为空")
    private String password;
    private String post;
    private String photo;
    private String phone;
    private String email;
    private String qq;
}
