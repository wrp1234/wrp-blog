package com.wrp.blog.common;

import com.wrp.blog.vo.UserVo;

/**
 * 用户信息的持有者，在每个请求过程中，保存了请求的当前用户信息
 * @author wrp
 * @since 2024-09-09 07:53
 **/
public class UserHolder {
    private static final ThreadLocal<UserVo> userThreadLocal = ThreadLocal.withInitial(UserVo::new);

    /**
     * 获取用户
     * @return 当前请求的用户
     */
    public static UserVo getUser() {
        return userThreadLocal.get();
    }

    /**
     * 设置用户
     * @param user 当前请求的用户
     */
    public static void setUser(UserVo user) {
        userThreadLocal.set(user);
    }

    /**
     * 移除用户信息，防止内存泄露
     */
    public static void removeUser() {
        userThreadLocal.remove();
    }
}
