package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.Integral;
import com.hnu.ccdm.entity.Sign;
import com.hnu.ccdm.entity.User;
import com.hnu.ccdm.service.IntegralService;
import com.hnu.ccdm.service.SignService;
import com.hnu.ccdm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    private UserService userService;

    @Autowired
    private IntegralService integralService;

    @Autowired
    private SignService signService;

    @ResponseBody
    @RequestMapping("/addSignScore")
    public String addScore(String account,String score,String source){
        List<User> userList=userService.getUserList();
        System.out.println(userList.get(0));
        for(User x:userList){
            if (x.getUserAccount().equals(account)){
                int scoreTemp=x.getUserScore()+Integer.valueOf(score);
                userService.setScoreByAccount(account,scoreTemp);

                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
                String integralId=account+df.format(new Date());

                Integral integral=new Integral();
                integral.setIntegralId(integralId);
                integral.setIntegralSum(Integer.valueOf(score));
                integral.setIntegralSourceId(source);
                integral.setIntegralTime(new Date());
                integral.setUserAccount(account);
                integralService.addIntegral(integral);

                Sign sign=new Sign();
                sign.setSignAccount(account);
                sign.setSignDate(new Date());
                sign.setSignId(account+new Date());
                if (signService.addSign(sign)>0){
                    return "签到成功";
                }

            }
        }
        return "签到失败";
    }

    @ResponseBody
    @RequestMapping("/decreaseScore")
    public String decreaseScore(String account,String score,String source){
        List<User> userList=userService.getUserList();
        for(User x:userList){
            if (x.getUserAccount().equals(account)){
                int scoreTemp=x.getUserScore()-Integer.valueOf(score);
                if (scoreTemp<0){
                    return "积分不可小于0！";
                }
                userService.setScoreByAccount(account,scoreTemp);

                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
                String integralId=account+df.format(new Date());

                Integral integral=new Integral();
                integral.setIntegralId(integralId);
                integral.setIntegralSum(Integer.valueOf(score));
                integral.setIntegralSourceId(source);
                integral.setIntegralTime(new Date());
                integral.setUserAccount(account);
                integralService.addIntegral(integral);
                return "扣除积分成功";
            }
        }
        return "扣除积分失败";
    }
}
