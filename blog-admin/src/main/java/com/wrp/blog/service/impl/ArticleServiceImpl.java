package com.wrp.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wrp.blog.common.enums.ResultType;
import com.wrp.blog.common.exception.BusinessException;
import com.wrp.blog.controller.support.AddArticleParam;
import com.wrp.blog.controller.support.PublishArticleParam;
import com.wrp.blog.controller.support.UpdateArticleParam;
import com.wrp.blog.domain.Article;
import com.wrp.blog.mapper.ArticleMapper;
import com.wrp.blog.service.ArticleService;
import com.wrp.blog.vo.ArticleVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author wrp
 * @since 2024-09-08 21:17
 **/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService {
    @Override
    public Long addArticle(AddArticleParam param) {
        return 0L;
    }

    @Override
    public void deleteArticle(Integer id) {

    }

    @Override
    public Long updateArticle(UpdateArticleParam param) {
        return 0L;
    }

    @Override
    public Long publishArticle(PublishArticleParam param) {
        return 0L;
    }

    @Override
    public Long star(Integer id) {
        return 0L;
    }

    @Override
    public Long cancelStar(Integer id) {
        return 0L;
    }

    @Override
    public IPage<ArticleVo> pageArticle(Long pageNo, Long pageSize, String keyword) {
        IPage<Article> page = new Page<>(pageNo, pageSize);
        page(page, new LambdaQueryWrapper<Article>()
                .like(StringUtils.hasText(keyword), Article::getTitle, keyword));
        IPage<ArticleVo> result = new Page<>();
        BeanUtils.copyProperties(page, result);
        result.setRecords(page.getRecords().stream().map(a-> {
            ArticleVo vo = new ArticleVo();
            BeanUtils.copyProperties(a, vo);
            return vo;
        }).toList());
        return result;
    }

    @Override
    public IPage<ArticleVo> selfArticle(Long pageNo, Long pageSize, String value) {
        return null;
    }

    @Override
    public ArticleVo detail(Integer id) {
        Article article = getById(id);
        if(article == null){
            throw BusinessException.of(ResultType.S_NOT_FOUND);
        }

        ArticleVo vo = new ArticleVo();
        BeanUtils.copyProperties(article, vo);
        return vo;
    }
}
