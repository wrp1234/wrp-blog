package com.wrp.blog.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wrp.blog.controller.support.AddArticleParam;
import com.wrp.blog.controller.support.PublishArticleParam;
import com.wrp.blog.controller.support.UpdateArticleParam;
import com.wrp.blog.domain.Article;
import com.wrp.blog.mapper.ArticleMapper;
import com.wrp.blog.service.ArticleService;
import com.wrp.blog.vo.ArticleVo;
import org.springframework.stereotype.Service;

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
    public void deleteArticle(Long id) {

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
    public Long star(Long id) {
        return 0L;
    }

    @Override
    public Long cancelStar(Long id) {
        return 0L;
    }

    @Override
    public IPage<ArticleVo> pageArticle(Long pageNo, Long pageSize, String value) {
        return null;
    }

    @Override
    public IPage<ArticleVo> selfArticle(Long pageNo, Long pageSize, String value) {
        return null;
    }
}
