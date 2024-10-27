package com.wrp.blog.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author wrp
 * @since 2024-10-26 18:25
 **/
@Getter
@AllArgsConstructor
public enum ResultTypeEnum {
    OK(10000, "成功"),
    U_USERNAME_USED(20001, "用户名已注册"),
    U_PHONE_USED(20002, "手机号已存在用户"),
    U_USERNAME_NOT_FOUND(20003, "用户名错误"),
    U_PASSWORD_ERROR(20004, "密码错误"),
    FAIL(99999, "失败"),
    ;

    private final int code;
    private final String message;
}
