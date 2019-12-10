package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.Sign;
import com.hnu.ccdm.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/sign")
public class SignController {

    @Autowired
    private SignService signService;

    @ResponseBody
    @RequestMapping("/judgeSign")
    public String judgeSign(String account){
        List<Sign> signList=signService.getSignList();
        System.out.println(signList.size());

        for (Sign x:signList){

            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String xDate=sdf.format(x.getSignDate());
            String pDate=sdf.format(new Date());
            if (x.getSignAccount().equals(account)&&xDate.equals(pDate))
            {
                return "今日已签到";
            }
        }
        return "今日未签到";
    }
}
