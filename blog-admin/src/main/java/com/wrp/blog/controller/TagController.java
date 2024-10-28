package com.wrp.blog.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wrp.blog.common.result.Result;
import com.wrp.blog.common.result.ResultUtils;
import com.wrp.blog.service.TagService;
import com.wrp.blog.vo.TagVo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wrp
 * @since 2024-10-27 11:17
 **/
@RestController
@RequestMapping("tag")
@AllArgsConstructor
public class TagController {

    private TagService tagService;

    @GetMapping
    public Result<IPage<TagVo>> page( @RequestParam(value = "pageNum", required = false, defaultValue = "1") Long pageNo,
                                      @RequestParam(value = "pageSize", required = false, defaultValue = "10") Long pageSize,
                                      @RequestParam(value = "keyword", required = false) String keyword) {
        return ResultUtils.success(tagService.page(pageNo, pageSize, keyword));
    }
}
