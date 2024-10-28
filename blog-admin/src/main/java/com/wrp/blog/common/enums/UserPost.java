package com.wrp.blog.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author wrp
 * @since 2024-10-10 07:47
 **/
@Getter
@AllArgsConstructor
public enum UserPost {
    STUDENT(1, "学生"),
    STAFF(2, "职场人员"),
    OTHER(3, "其他")
    ;

    @JsonValue
    @EnumValue
    private final int code;
    private final String name;
}
