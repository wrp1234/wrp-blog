package com.wrp.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wrp.blog.domain.Attachment;
import com.wrp.blog.mapper.AttachmentMapper;
import com.wrp.blog.service.AttachmentService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author wrp
 * @since 2024-09-08 21:18
 **/
@Service
public class AttachmentServiceImpl extends ServiceImpl<AttachmentMapper, Attachment> implements AttachmentService {
    @Override
    public String upload(MultipartFile file) {
        return "";
    }
}
