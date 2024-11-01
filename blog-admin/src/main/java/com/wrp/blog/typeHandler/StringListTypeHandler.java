package com.wrp.blog.typeHandler;

import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;

/**
 * @author wrp
 * @since 2024-09-08 21:14
 **/
public class StringListTypeHandler  extends ListTypeHandler<String> {

    // 将ListTypeHandler<T>（T为任意对象），具体为特定的对象String
    @Override
    protected TypeReference<List<String>> specificType() {
        return new TypeReference<>() {};
    }
}