package com.wrp.blog.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.wrp.blog.common.enums.UserPost;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户
 * @author wrp
 * @since 2024-09-08 18:36
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("public.user")
public class User extends BaseEntity {
    private String username;
    private String password;
    /**
     * 身份：学生、职场人员
     */
    private UserPost post;
    /**
     * 头像
     */
    private String photo;
    private String phone;
    private String email;
    private String openid;
    private String qq;
}
