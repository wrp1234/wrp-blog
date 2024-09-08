package com.wrp.blog.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 评论
 * @author wrp
 * @since 2024-09-08 18:40
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("comment")
public class Comment extends BaseEntity {
    private String content;
    private Long userId;
    private Long articleId;
    private Long parentId;

    /**
     * 点赞数
     */
    private Long stars;
}
