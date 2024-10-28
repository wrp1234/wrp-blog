package com.wrp.blog.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 标签
 * @author wrp
 * @since 2024-10-27 11:14
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "public.tag", autoResultMap = true)
public class Tag extends BaseEntity {
    private String name;
}
