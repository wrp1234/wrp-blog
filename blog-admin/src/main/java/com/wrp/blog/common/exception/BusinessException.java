package com.wrp.blog.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

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
        this("服务器内部异常");
    }

    public BusinessException(String msg) {
        this(HttpStatus.INTERNAL_SERVER_ERROR.value(), msg);
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
