package com.wrp.blog.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wrp.blog.common.result.Result;
import com.wrp.blog.common.result.ResultUtils;
import com.wrp.blog.controller.support.AddArticleParam;
import com.wrp.blog.controller.support.PublishArticleParam;
import com.wrp.blog.controller.support.UpdateArticleParam;
import com.wrp.blog.service.ArticleService;
import com.wrp.blog.vo.ArticleVo;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author wrp
 * @since 2024-09-08 20:20
 **/
@RestController
@RequestMapping("article")
@AllArgsConstructor
public class ArticleController {

    private ArticleService articleService;

    @PostMapping()
    public Result<Long> addArticle(@Validated AddArticleParam param) {
        Long id = articleService.addArticle(param);
        return ResultUtils.success(id);
    }

    @DeleteMapping("{id}")
    public Result<Void> deleteArticle(@PathVariable("id") Long id) {
        articleService.deleteArticle(id);
        return ResultUtils.success();
    }

    @PutMapping()
    public Result<Long> updateArticle(@Validated UpdateArticleParam param) {
        Long id = articleService.updateArticle(param);
        return ResultUtils.success(id);
    }

    @PostMapping("publish")
    public Result<Long> publishArticle(@Validated PublishArticleParam param) {
        Long id = articleService.publishArticle(param);
        return ResultUtils.success(id);
    }

    @PostMapping("star/{id}")
    public Result<Long> star(@PathVariable("id") Long id) {
        Long stars = articleService.star(id);
        return ResultUtils.success(stars);
    }

    @PostMapping("/cancel/star/{id}")
    public Result<Long> cancelStar(@PathVariable("id") Long id) {
        Long stars = articleService.cancelStar(id);
        return ResultUtils.success(stars);
    }

    @GetMapping()
    public Result<IPage<ArticleVo>> page(
            @RequestParam(value = "pageNo", required = false, defaultValue = "1") Long pageNo,
            @RequestParam(value = "pageSize", required = false, defaultValue = "10") Long pageSize,
            @RequestParam(value = "value") String value
    ) {
        IPage<ArticleVo> page = articleService.pageArticle(pageNo, pageSize, value);
        return ResultUtils.success(page);
    }

    @GetMapping("self")
    public Result<IPage<ArticleVo>> selfArticle(
            @RequestParam(value = "pageNo", required = false, defaultValue = "1") Long pageNo,
            @RequestParam(value = "pageSize", required = false, defaultValue = "10") Long pageSize,
            @RequestParam(value = "value") String value
    ) {
        IPage<ArticleVo> page = articleService.selfArticle(pageNo, pageSize, value);
        return ResultUtils.success(page);
    }



}
