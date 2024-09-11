package com.wrp.blog.vo;

import lombok.Data;

/**
 * @author wrp
 * @since 2024-09-08 21:50
 **/
@Data
public class UserVo {
    private Long id;
    private String username;
    private String post;
    private String photo;
    private String phone;
    private String email;
    private String openid;
    private String qq;
    private String token;
}
