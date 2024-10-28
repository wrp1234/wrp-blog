package com.wrp.blog.util;

import org.springframework.context.ApplicationContext;

/**
 * 有风险，TODO 待优化
 * @author wrp
 * @since 2024-10-27 10:50
 **/
public class SpringContextUtils {

    private static ApplicationContext applicationContext;

    public static void setApplicationContext(ApplicationContext applicationContext) {
        SpringContextUtils.applicationContext = applicationContext;
    }

    public static <T> T getBean(Class<T> clazz) {
        return applicationContext.getBean(clazz);
    }

    public static <T> T getBean(String beanName, Class<T> clazz) {
        return applicationContext.getBean(beanName, clazz);
    }
}
