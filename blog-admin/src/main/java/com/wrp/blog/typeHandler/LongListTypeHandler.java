package com.wrp.blog.typeHandler;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * @author wrp
 * @since 2024-09-08 21:14
 **/
public class LongListTypeHandler extends ListTypeHandler<Long> {
    public LongListTypeHandler(ObjectMapper objectMapper) {
        super(objectMapper);
    }

    // 将ListTypeHandler<T>（T为任意对象），具体为特定的对象String
    @Override
    protected TypeReference<List<Long>> specificType() {
        return new TypeReference<>() {};
    }
}