package com.wrp.blog.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wrp.blog.common.result.Result;
import com.wrp.blog.common.result.ResultUtils;
import com.wrp.blog.controller.support.AddCommentParam;
import com.wrp.blog.service.CommentService;
import com.wrp.blog.vo.CommentVo;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author wrp
 * @since 2024-09-08 21:28
 **/
@RestController
@RequestMapping("comment")
@AllArgsConstructor
public class CommentController {

    private CommentService commentService;

    @PostMapping()
    public Result<Long> publishComment(@Validated AddCommentParam param) {
        Long id = commentService.publishComment(param);
        return ResultUtils.success(id);
    }

    @GetMapping("")
    public Result<IPage<CommentVo>> pageArticle(
            @RequestParam(value = "pageNo", required = false, defaultValue = "1") Long pageNo,
            @RequestParam(value = "pageSize", required = false, defaultValue = "10") Long pageSize,
            @RequestParam("articleId") Long articleId
    ) {
        IPage<CommentVo> page = commentService.pageArticle(pageNo, pageSize, articleId);
        return ResultUtils.success(page);
    }

    @GetMapping("self")
    public Result<IPage<CommentVo>> pageComment(
            @RequestParam(value = "pageNo", required = false, defaultValue = "1") Long pageNo,
            @RequestParam(value = "pageSize", required = false, defaultValue = "10") Long pageSize,
            @RequestParam("id") Long id
    ) {
        IPage<CommentVo> page = commentService.pageComment(pageNo, pageSize, id);
        return ResultUtils.success(page);
    }
}
