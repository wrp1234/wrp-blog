package com.wrp.blog.common.result;

import lombok.Getter;

/**
 * @author wrp
 * @date 2024年08月09日 19:41
 * @since 1.0.0
 */

@Getter
public enum ResultState {
    SUCCESS(200, "成功"),
    REQUEST_FAIL(400, "客户端异常"),
    RESPONSE_FAIL(500, "服务器异常")
    ;

    private final int code;
    private final String msg;

    ResultState(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
