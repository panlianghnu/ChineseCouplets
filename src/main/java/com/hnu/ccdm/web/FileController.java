package com.hnu.ccdm.web;


import com.hnu.ccdm.entity.User;
import com.hnu.ccdm.service.UserService;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 图片上传
 *
 * @author FanChen
 * @since 2018年6月1日 上午12:46:29
 */
@Controller
@RequestMapping("/upload")
public class FileController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/uploadImage", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView uploadImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("进入get方法！");

        MultipartHttpServletRequest req =(MultipartHttpServletRequest)request;
        MultipartFile multipartFile =  req.getFile("file");

        String realPath = "/home/ubuntu/userPortrait";
        String userId = request.getParameter("userId");
        String fileName = userId + "_" + new Date().getTime() + ".jpg";
        try {
            File dir = new File(realPath);
            if (!dir.exists()) {
                dir.mkdir();
            }
            File file  =  new File(realPath,fileName);
            multipartFile.transferTo(file);
            userService.setPortraitByAccount(userId, "http://106.54.206.129:8080/pictures/"+fileName);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return null;
    }

}
