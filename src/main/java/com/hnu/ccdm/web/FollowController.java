package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.Follow;
import com.hnu.ccdm.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FollowController {
    @Autowired
    private FollowService followService;

    @ResponseBody
    @RequestMapping("/follow")
    String follow(String id, String followId){   //id关注followId
        List<Follow> list = followService.getFollowList();
        boolean flag = false;
        for(Follow x : list){
            if(x.getUserAccount().equals(id) && x.getFollowFollowedaccount().equals(followId))
                flag = true;
        }
        if(flag){
            return "已关注过该用户";
        }
        if(followService.addFollow(id,followId) > 0)
            return "关注成功";
        else
            return "关注失败";
    }

    @ResponseBody
    @RequestMapping("unfollow")
    String unfollow(String id, String followId){
        if(followService.deleteFollow(id, followId) > 0){
            return "取消关注成功";
        }
        return "取消关注失败";
    }

    @ResponseBody
    @RequestMapping("judgeFollow")
    int judgeFollow(String id,String followId){
        if(id.equals(followId)) return 0;
        List<Follow> followList = followService.getFollowList();
        for(Follow x : followList){
            if(x.getUserAccount().equals(id) && x.getFollowFollowedaccount().equals(followId)){
                return 1;    //关注过返回1
            }
        }
        return -1;       //未关注返回-1
    }
}
