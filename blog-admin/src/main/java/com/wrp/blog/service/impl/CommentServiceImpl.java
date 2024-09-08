package com.wrp.blog.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wrp.blog.controller.support.AddCommentParam;
import com.wrp.blog.domain.Comment;
import com.wrp.blog.mapper.CommentMapper;
import com.wrp.blog.service.CommentService;
import com.wrp.blog.vo.CommentVo;
import org.springframework.stereotype.Service;

/**
 * @author wrp
 * @since 2024-09-08 21:19
 **/
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {
    @Override
    public Long publishComment(AddCommentParam param) {
        return 0L;
    }

    @Override
    public IPage<CommentVo> pageArticle(Long pageNo, Long pageSize, Long articleId) {
        return null;
    }

    @Override
    public IPage<CommentVo> pageComment(Long pageNo, Long pageSize, Long id) {
        return null;
    }
}
