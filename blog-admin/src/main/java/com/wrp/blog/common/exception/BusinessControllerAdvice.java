package com.wrp.blog.common.exception;


import com.wrp.blog.common.result.Result;
import com.wrp.blog.common.result.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 * @author wrp
 * @date 2024年08月17日 15:16
 * @since 1.0.0
 */
@Slf4j
@RestControllerAdvice
public class BusinessControllerAdvice {

    @ExceptionHandler(BusinessException.class)
    public Result<String> handleBusinessException(BusinessException e) {
        return ResultUtils.error(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result<String> handle(Exception e) {
        log.error("异常信息：", e);
        return ResultUtils.error("系统内部异常");
    }
}
