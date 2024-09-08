package com.wrp.blog.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wrp.blog.controller.support.AddArticleParam;
import com.wrp.blog.controller.support.PublishArticleParam;
import com.wrp.blog.controller.support.UpdateArticleParam;
import com.wrp.blog.domain.Article;
import com.wrp.blog.vo.ArticleVo;

/**
 * @author wrp
 * @since 2024-09-08 20:19
 **/
public interface ArticleService extends IService<Article> {
    /**
     * 添加文章
     * @param param 文章
     * @return 文章id
     */
    Long addArticle(AddArticleParam param);

    /**
     * 删除文章
     * @param id 文章id
     */
    void deleteArticle(Long id);

    /**
     * 更新文章的内容（标题、摘要、正文、标签）
     * @param param 文章的内容
     * @return 文章id
     */
    Long updateArticle(UpdateArticleParam param);

    /**
     * 发布文章，同时也可以更新文章内容
     * @param param 文章的内容
     * @return 文章id
     */
    Long publishArticle(PublishArticleParam param);

    /**
     * 喜欢文章
     * @param id 文章id
     * @return 最新的star数
     */
    Long star(Long id);

    /**
     * 取消喜欢
     * @param id 文章id
     * @return 最新的star数
     */
    Long cancelStar(Long id);

    /**
     * 分页查询所有的文章
     * @param pageNo 页码
     * @param pageSize 分页大小
     * @param value 模糊查询，支持标题、摘要
     * @return 文章列表
     */
    IPage<ArticleVo> pageArticle(Long pageNo, Long pageSize, String value);

    /**
     * 分页查询自己的文章
     * @param pageNo 页码
     * @param pageSize 分页大小
     * @param value 模糊查询，支持标题、摘要
     * @return 文章列表
     */
    IPage<ArticleVo> selfArticle(Long pageNo, Long pageSize, String value);
}
