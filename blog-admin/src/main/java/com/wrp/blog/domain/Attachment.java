package com.wrp.blog.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 附件
 * @author wrp
 * @since 2024-09-08 18:52
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("attachment")
public class Attachment extends BaseEntity {
    private String originalName;
    private String fileName;
    private String contentType;
    private String filePath;
    private Long size;
    /**
     * 解决文件重复上传的问题
     */
    private String md5;
    private Long userId;
}
