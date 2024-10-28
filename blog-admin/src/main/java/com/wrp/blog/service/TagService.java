package com.wrp.blog.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wrp.blog.domain.Tag;
import com.wrp.blog.vo.TagVo;

/**
 * @author wrp
 * @since 2024-10-27 11:16
 **/
public interface TagService extends IService<Tag> {

    IPage<TagVo> page(Long pageNo, Long pageSize, String keyword);
}
