package com.wrp.blog.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author wrp
 * @since 2024-09-08 21:23
 **/
@Data
public class ArticleVo {
    private Integer id;
    private String title;
    private String content;
    private String description;
    private Integer imgId;
    private Integer authorId;

    private Integer views;
    private Integer comments;
    private Integer likes;
    private LocalDateTime createTime;
}
