package com.wrp.blog.common.exception;

import com.wrp.blog.common.result.ResultState;
import lombok.Getter;

/**
 * 自定义异常
 * @author wrp
 * @date 2024年08月17日 15:15
 * @since 1.0.0
 */
@Getter
public class BusinessException extends RuntimeException {

    private final int code;
    private final String msg;

    public BusinessException() {
        this(ResultState.RESPONSE_FAIL.getMsg());
    }

    public BusinessException(String msg) {
        this(ResultState.RESPONSE_FAIL.getCode(), msg);
    }

    public BusinessException(int code, String msg) {
        this(null,code, msg);
    }

    public BusinessException(Throwable cause, int code, String msg) {
        super(msg, cause);
        this.code = code;
        this.msg = msg;
    }
}
