package com.wrp.blog.controller;

import com.wrp.blog.common.result.Result;
import com.wrp.blog.common.result.ResultUtils;
import com.wrp.blog.service.AttachmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author wrp
 * @since 2024-09-08 21:41
 **/
@RestController
@RequestMapping("attachment")
@AllArgsConstructor
public class AttachmentController {

    private AttachmentService attachmentService;

    @PostMapping
    public Result<String> upload(@RequestPart("file") MultipartFile file) {
        String url = attachmentService.upload(file);
        return ResultUtils.success(url);
    }

}
