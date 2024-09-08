package com.wrp.blog.vo;

import lombok.Data;

/**
 * @author wrp
 * @since 2024-09-08 21:37
 **/
@Data
public class CommentVo {
    private Long id;
    private String content;
    private boolean hasChildren;
}
