package com.hnu.ccdm.web;

import com.hnu.ccdm.Aliyun.PhoneCode;
import com.hnu.ccdm.entity.Follow;
import com.hnu.ccdm.entity.Message;
import com.hnu.ccdm.entity.User;
import com.hnu.ccdm.entity.UserExample;
import com.hnu.ccdm.service.FollowService;
import com.hnu.ccdm.service.MessageService;
import com.hnu.ccdm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/user")

//所有的Account才是电话号码   ,   Number是身份证号码
//把getUerNumber 改成 getUserAccount

public class UserController {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;
    @Autowired
    private MessageService messageService;
    @Autowired
    private FollowService followService;

    @ResponseBody
    @RequestMapping("/login")
    /*   密码错误     登录成功返回账户ID   账户不存在*/
    public String login(String phone, String pass) {
        List<User> list = userService.getUserList();
        boolean flag = false;
        for (User x : list) {
            if (x.getUserAccount().equals(phone)) {
                if (x.getUserPassword().equals(pass))
                    return x.getUserAccount();
                flag = true;
            }
        }
        if (flag) return "密码错误";
        return "账户不存在";
    }

    @ResponseBody
    @RequestMapping("/register")
    public String register(String phone) {
        System.out.println(phone);
        List<User> list = userService.getUserList();
        for (User x : list) {
            if (phone.equals(x.getUserAccount())) {
                return "该号码已注册";
            }
        }
        boolean b = Pattern.matches("1\\d{10}", phone);    //如果b为true 则为手机号
        if (!b) return "请输入正确的手机号";
        return PhoneCode.sendSMS(phone);
    }

    @ResponseBody
    @RequestMapping("register2")
    public String addUser(String phone, String pass) {
        User tmp = new User();
        tmp.setUserPassword(pass);
        tmp.setUserAccount(phone);
        tmp.setUserTime(new Date());
        tmp.setUserNickname("默认昵称");
        tmp.setUserPortrait("http://106.54.206.129:8080/pictures/saber.jpg");   //默认头像
        tmp.setUserAge(0);
        tmp.setUserBirthday(new Date());
        tmp.setUserEmail("  ");
        tmp.setUserLabel("说点什么吧～");
        tmp.setUserLocation("  ");
        tmp.setUserName("  ");
        tmp.setUserNumber("  ");
        tmp.setUserPlace("  ");
        tmp.setUserScore(0);
        tmp.setUserDate(new Date());
        tmp.setUserHonoraryofmember("  ");
        tmp.setUserOfassociation("  ");
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        tmp.setUserTime(date);
        userService.addUser(tmp);
        return "注册成功";
    }

    @ResponseBody
    @RequestMapping("/setName")
    public String setName(String id, String name) {
        if(userService.setUserNameByAccount(id,name)>0) return "设置姓名成功";
        return "设置姓名失败";
    }

    @ResponseBody
    @RequestMapping("/setNickName")
    public String setNickName(String id, String nickname) {
        if (nickname.equals("") || nickname.length() > 20) return "请输入正确的昵称";
        if(userService.setNickNameByAccount(id,nickname)>0) return "设置昵称成功";
        return "设置昵称失败";
    }

    @ResponseBody
    @RequestMapping("/setLocation")
    public String setLocation(String id, String location) {
        if (location.equals("") || location.length() > 255) {
            return "请输入正确的地址";
        }
        if(userService.setLocationByAccount(id,location)>0) return "设置地址成功";
        return "设置地址失败";
    }


    @ResponseBody
    @RequestMapping("/setEmail")
    public String setEmail(String id, String email) {
        if(!email.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"))
            return "请输入正确的邮箱";
        if(userService.setEmailByAccount(id, email)>0) {
            return "设置邮箱成功";
        }
        return "设置邮箱失败";
    }


    @ResponseBody
    @RequestMapping("/setLabel")
    public String setLabel(String id, String label) {
        List<User> list = userService.getUserList();
        if(userService.setLabelByAccount(id, label)>0) {
            return "设置个性签名成功";
        }
        return "设置个性签名失败";
    }

    @ResponseBody
    @RequestMapping("/retUser")
    public User retUser(String id) {
        List<User> list = userService.getUserList();
        for (User x : list) {
            if (x.getUserAccount().equals(id))
                return x;
        }
        return null;
    }

    @ResponseBody
    @RequestMapping("/setAge")
    public String setAge(String id, String age) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(age);
        if (!isNum.matches()) {
            return "请输入数字";
        }
        int ageint = Integer.valueOf(age);
        if (userService.setAgeByAccount(id,ageint)>0){
            return "设置年龄成功";
        }
        return "设置年龄失败";
    }

    @ResponseBody
    @RequestMapping("/setBirthday")
    public String setBirthday(String id, String birthday)  throws Exception{
        java.text.SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(birthday);
        if (userService.setBirthdayByAccount(id,date)>0){
            return "设置生日成功";
        }
        return "设置生日失败";
    }

    @ResponseBody
    @RequestMapping("/setPlace")//设置籍贯
    public String setPlace(String id, String place) {
        if (userService.setPlaceByAccount(id, place)>0){
            return "设置籍贯成功";
        }
        return "设置籍贯失败";
    }

    @ResponseBody
    @RequestMapping("/setNumber")//设置身份证号
    public String setNumber(String id, String number) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(number);
        if (!isNum.matches()||number.length()!=18) {
            return "请输入正确的身份证号";
        }
        if (userService.setNumberByAccount(id, number)>0){
            return "设置身份证号成功";
        }
        return "设置身份证号失败";
    }



    @ResponseBody
    @RequestMapping("/setPassword")
    public String setPassword(String id ,String password){
        if (userService.setPasswordByAccount(id, password)>0){
            return "修改密码成功";
        }
        return "修改密码失败";
    }

    @ResponseBody
    @RequestMapping("/getMessagesByReceiverId")
    public List<Message> getMessagesByReceiverId(String id){
        List<Message> list = messageService.getMessageList();
        List<Message> toBack = new LinkedList<>();
        for(Message x : list){
            if(x.getMessageReceiverid().equals(id)){
                toBack.add(x);
            }
        }
        return toBack;
    }

    @ResponseBody
    @RequestMapping("/getMyFansById")
    public List<User> getMyFansById(String id){
        List<User> list = userService.getUserList();
        List<User> toBack = new LinkedList<>();
        List<Follow> follows = followService.getFollowList();
        List<String> idList = new LinkedList<>();
        for(Follow x : follows){
            if(x.getFollowFollowedaccount().equals(id)){    //找到被关注人的id
                idList.add(x.getUserAccount());             //idList保存这个fans
            }
        }
        for(User x : list){
            for(String y : idList){
                if(x.getUserAccount().equals(y))
                    toBack.add(x);
            }
        }
        return toBack;
    }

    @ResponseBody
    @RequestMapping("getMyFollowingsById")
    List<User> getMyFollowingsById(String id){
        List<User> list = userService.getUserList();
        List<User> toBack = new LinkedList<>();
        List<Follow> follows = followService.getFollowList();
        List<String> idList = new LinkedList<>();
        for(Follow x : follows){
            if(x.getUserAccount().equals(id)){    //找到关注人是id的
                idList.add(x.getFollowFollowedaccount());             //idList保存这个被关注人
            }
        }
        for(User x : list){
            for(String y : idList){
                if(x.getUserAccount().equals(y))
                    toBack.add(x);
            }
        }
        return toBack;
    }

    @ResponseBody
    @RequestMapping("getIdentifyCode")
    String getIdentifyCode(String phone){
        List<User> list = userService.getUserList();
        boolean flag = false;       //flag表示手机号是否存在
        for(User x : list){
            if(x.getUserAccount().equals(phone))
                flag = true;
        }
        if(!flag){
            return "手机号不存在";
        }
        return PhoneCode.sendSMS(phone);
    }
}
