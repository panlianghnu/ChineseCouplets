package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.User;
import com.hnu.ccdm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller //告诉编译器这里个控制器
public class HelloController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello(){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Date().getTime();
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);

        return res;
    }

}
