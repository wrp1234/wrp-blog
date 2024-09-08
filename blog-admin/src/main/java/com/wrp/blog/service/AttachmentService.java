package com.wrp.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wrp.blog.domain.Attachment;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author wrp
 * @since 2024-09-08 20:21
 **/
public interface AttachmentService extends IService<Attachment> {

    /**
     * 上传文件
     * @param file 文件
     * @return 文件url
     */
    String upload(MultipartFile file);
}
