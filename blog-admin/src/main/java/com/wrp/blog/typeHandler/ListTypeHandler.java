package com.wrp.blog.typeHandler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.*;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wrp
 * @since 2024-09-08 21:07
 **/
@Slf4j
@MappedJdbcTypes(JdbcType.VARCHAR)  //数据库类型
@MappedTypes({List.class})          //java数据类型
public abstract class ListTypeHandler <T> extends BaseTypeHandler<List<T>> {

    private final ObjectMapper objectMapper;

    public ListTypeHandler(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, List<T> parameter, JdbcType jdbcType) throws SQLException {
        String content = null;
        try {
            content = CollectionUtils.isEmpty(parameter) ? null : objectMapper.writeValueAsString(parameter);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        ps.setString(i, content);
    }

    @Override
    public List<T> getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return this.getListByJsonArrayString(rs.getString(columnName));
    }

    @Override
    public List<T> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return this.getListByJsonArrayString(rs.getString(columnIndex));
    }

    @Override
    public List<T> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return this.getListByJsonArrayString(cs.getString(columnIndex));
    }

    private List<T> getListByJsonArrayString(String content) {
        try {
            return StringUtils.hasText(content) ?  objectMapper.readValue(content, specificType()): new ArrayList<>();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 具体类型，由子类提供
     *
     * @return 具体类型
     */
    protected abstract TypeReference<List<T>> specificType();
}