package com.wrp.blog.common;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * 测试RedisTemplate
 * @author wrp
 * @since 2024-09-11 08:20
 **/
@SpringBootTest
public class RedisTemplateTest {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 设置string
     */
    @Test
    public void setString() {

    }

    /**
     * 获取string
     */
    @Test
    public void getString() {

    }
}
