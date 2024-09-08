package com.wrp.blog.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wrp.blog.typeHandler.LongListTypeHandler;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 用户
 * @author wrp
 * @since 2024-09-08 18:36
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("user")
public class User extends BaseEntity {
    private String username;
    private String password;
    /**
     * 身份：学生、职场人员
     */
    private String post;
    /**
     * 头像
     */
    private String photo;
    private String phone;
    private String email;
    private String openid;
    private String qq;

    @TableField(typeHandler = LongListTypeHandler.class)
    private List<Long> friends;

    /**
     * 喜欢的文章
     */
    @TableField(typeHandler = LongListTypeHandler.class)
    private List<Long> starOfArticles;
    /**
     * 喜欢的评论
     */
    @TableField(typeHandler = LongListTypeHandler.class)
    private List<Long> starOfComments;
}
