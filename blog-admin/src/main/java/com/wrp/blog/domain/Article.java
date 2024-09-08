package com.wrp.blog.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wrp.blog.typeHandler.StringListTypeHandler;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 文章
 * @author  wrp
 * @since  2024-09-08 18:34
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("article")
public class Article extends BaseEntity {
    private String title;
    /**
     * 摘要内容
     */
    private String summary;
    /**
     * 主体内容
     */
    private String content;
    private Long authorId;
    @TableField(typeHandler = StringListTypeHandler.class)
    private List<String> tags;

    /**
     * 是否发表
     */
    private Boolean published;
    /**
     * 是否公开
     */
    private Boolean exposed;

    /**
     * 喜欢数
     */
    private Long stars;
}
