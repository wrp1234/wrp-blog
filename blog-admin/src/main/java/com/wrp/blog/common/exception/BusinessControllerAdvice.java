package com.wrp.blog.common.exception;


import com.wrp.blog.common.result.Result;
import com.wrp.blog.common.result.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.stream.Collectors;

/**
 * 全局异常处理
 * @author wrp
 * @date 2024年08月17日 15:16
 * @since 1.0.0
 */
@Slf4j
@RestControllerAdvice
public class BusinessControllerAdvice {

    @ExceptionHandler(NoResourceFoundException.class)
    public Result<String> handleNoResourceFoundException(NoResourceFoundException e) {
        return ResultUtils.error(HttpStatus.NOT_FOUND, "资源不存在");
    }

    /**
     * 处理参数校验失败
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        return ResultUtils.error(e.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(error-> error.getDefaultMessage() + "，请输入参数[" + error.getField() + "]")
                .collect(Collectors.joining(";")));
    }

    @ExceptionHandler(BusinessException.class)
    public Result<String> handleBusinessException(BusinessException e) {
        return ResultUtils.error(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result<String> handle(Exception e) {
        log.error("异常信息：", e);
        return ResultUtils.error("系统内部异常，请联系管理员");
    }
}
