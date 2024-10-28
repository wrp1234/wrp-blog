package com.wrp.blog.common.result;

import lombok.Getter;

/**
 * 所有的web请求结果
 * @author wrp
 * @since 2024年08月09日 19:36
 *
 * @see ResultUtils
 */
@Getter
public class Result<T> {
    private final int code;
    private final String message;
    private final T data;
    private final long timestamp;

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = System.currentTimeMillis();
    }
}
