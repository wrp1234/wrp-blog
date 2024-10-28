package com.wrp.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wrp.blog.domain.Tag;
import com.wrp.blog.mapper.TagMapper;
import com.wrp.blog.service.TagService;
import com.wrp.blog.vo.TagVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author wrp
 * @since 2024-10-27 11:16
 **/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {
    @Override
    public IPage<TagVo> page(Long pageNo, Long pageSize, String keyword) {
        IPage<Tag> page = new Page<>(pageNo, pageSize);
        page(page, new LambdaQueryWrapper<Tag>()
                .like(StringUtils.hasText(keyword), Tag::getName, keyword));

        IPage<TagVo> result = new Page<>();
        BeanUtils.copyProperties(page, result);
        result.setRecords(page.getRecords().stream().map(t-> {
            TagVo vo = new TagVo();
            BeanUtils.copyProperties(t, vo);
            return vo;
        }).toList());
        return result;
    }
}
