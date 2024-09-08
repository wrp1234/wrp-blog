package com.wrp.blog.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wrp.blog.controller.support.AddCommentParam;
import com.wrp.blog.domain.Comment;
import com.wrp.blog.vo.CommentVo;

/**
 * @author wrp
 * @since 2024-09-08 20:21
 **/
public interface CommentService extends IService<Comment> {

    /**
     * 发布评论
     * @param param 评论内容
     * @return 评论id
     */
    Long publishComment(AddCommentParam param);

    /**
     * 分页查询文章的评论
     * @param pageNo 页码
     * @param pageSize 分页大小
     * @param articleId 文章id
     * @return 评论列表
     */
    IPage<CommentVo> pageArticle(Long pageNo, Long pageSize, Long articleId);

    /**
     * 分页查询评论的评论
     * @param pageNo 页码
     * @param pageSize 分页大小
     * @param id 评论id
     * @return 评论列表
     */
    IPage<CommentVo> pageComment(Long pageNo, Long pageSize, Long id);
}
