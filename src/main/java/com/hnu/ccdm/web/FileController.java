package com.hnu.ccdm.web;

import com.alibaba.fastjson.JSON;
import com.hnu.ccdm.entity.User;
import com.hnu.ccdm.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.logging.Logger;

@RestController
@RequestMapping("/upload")
@CrossOrigin
public class FileController {
    @Value("${prop.upload-folder}")
    private final String UPLOAD_FOLDER="/home/ubuntu/userPortrait/";

    @Autowired
    private UserService userService;

    public Object singleFileUpload(MultipartFile file , String userId) {
        if (file.isEmpty() || file.equals(null)) {
            return "文件为空，请重新上传";
        }

        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOAD_FOLDER +userId + file.getOriginalFilename());
            //如果没有files文件夹，则创建
            if (!Files.isWritable(path)) {
                Files.createDirectories(Paths.get(UPLOAD_FOLDER));
            }
            //文件写入指定路径
            Files.write(path, bytes);
            User user = userService.getUserByAccount(userId);
            user.setUserPortrait(""+path);
            return "文件上传成功";
        } catch (IOException e) {
            e.printStackTrace();
            return "后端异常...";
        }
    }
}