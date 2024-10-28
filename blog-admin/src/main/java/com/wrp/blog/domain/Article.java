package com.wrp.blog.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文章
 * @author  wrp
 * @since  2024-09-08 18:34
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "public.article", autoResultMap = true)
public class Article extends BaseEntity {
    private String title;
    /**
     * 主体内容
     */
    private String content;
    private String description;
    private Integer imgId;
    private Integer authorId;

    private Integer views;
    private Integer comments;
    private Integer likes;
}
