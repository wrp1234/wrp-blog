package com.wrp.blog.common.result;

/**
 * @author wrp
 * @date 2024年08月09日 19:39
 * @since 1.0.0
 */
public class ResultUtils {

    public static Result<Void> success() {
        return success(null);
    }

    public static <T> Result<T> success(T data) {
        return success(ResultState.SUCCESS.getCode(), null, data);
    }

    public static <T> Result<T> success(int code, String msg, T data) {
        return getResultInstance(code, msg, data);
    }

    public static <T> Result<T> error(String msg) {
        return error(ResultState.RESPONSE_FAIL.getCode(), msg);
    }

    public static <T> Result<T> error(int code, String msg) {
        return getResultInstance(code, msg, null);
    }

    private static <T> Result<T> getResultInstance(int code, String msg, T data) {
        return new Result<>(code, msg, data);
    }
}
