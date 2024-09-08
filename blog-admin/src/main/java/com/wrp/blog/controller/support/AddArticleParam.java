package com.wrp.blog.controller.support;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

/**
 * @author wrp
 * @since 2024-09-08 20:24
 **/
@Data
public class AddArticleParam {
    @NotEmpty(message = "文章标题不能为空")
    private String title;
    /**
     * 摘要内容
     */
    @NotEmpty(message = "文章摘要不能为空")
    private String summary;
    /**
     * 主体内容
     */
    @NotEmpty(message = "文章正文不能为空")
    private String content;
    private List<String> tags;
    /**
     * 是否发表
     */
    private Boolean published;
    /**
     * 是否公开
     */
    private Boolean exposed;
}
