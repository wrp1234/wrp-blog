package com.wrp.blog.common.config;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;

/**
 * 自定义Id生成器，默认的生成器id太长，会导致前端id精度丢失
 * @author wrp
 * @since 2024-09-23 08:29
 **/
//@Component
public class CustomerIdGenerator implements IdentifierGenerator {
    @Override
    public Number nextId(Object entity) {
        // TODO 待实现
        return null;
    }
}
