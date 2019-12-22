package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.MyReplyInfo;
import com.hnu.ccdm.entity.Post;
import com.hnu.ccdm.entity.Reply;
import com.hnu.ccdm.entity.User;
import com.hnu.ccdm.service.PostService;
import com.hnu.ccdm.service.ReplyService;
import com.hnu.ccdm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/userSpace")

public class UserSpaceController {

    @Autowired
    private ReplyService replyService;
    @Autowired
    private PostService postService;
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getMyReplyInfoList")
    public List<MyReplyInfo> getMyReplyInfoList(String userId){
        List<MyReplyInfo> toBack = new LinkedList<>();
        List<Reply> replyList = replyService.getReplyList();
        Collections.sort(replyList);
        List<Post> postList = postService.getPostList();
        //先找出所有我的帖子， 然后找出所有我的帖子收到的回复
        List<Post> myPosts = new LinkedList<>();
        List<User> userList = userService.getUserList();
        for(Post x : postList){
            if(x.getUserAccount().equals(userId)){        //这是我发的帖子
                myPosts.add(x);
            }
        }
        for(Reply reply : replyList){                                   //遍历回复
            for(Post myPost : myPosts){                                 //遍历我的帖子
                if(reply.getPostId().equals(myPost.getPostId())){       //这是一条我的帖子的回复
                    MyReplyInfo temp = new MyReplyInfo();
                    temp.setPostId(myPost.getPostId());
                    temp.setPostTitle(myPost.getPostTitle());
                    temp.setReplyContent(reply.getReplyContent());
                    temp.setReplyId(reply.getReplyId());
                    temp.setReplyTime(reply.getReplyTime());
                    temp.setUserAccount(reply.getUserAccount());        //根据userId遍历找到头像和昵称
                    for(User user : userList){
                        if(user.getUserAccount().equals(reply.getUserAccount())){
                            temp.setUserNickname(user.getUserNickname());
                            temp.setUserPortrait(user.getUserPortrait());
                            break;
                        }
                    }
                    toBack.add(temp);
                    break;
                }
            }
        }
        Collections.sort(toBack, new Comparator<MyReplyInfo>() {
            @Override
            public int compare(MyReplyInfo myReplyInfo, MyReplyInfo t1) {
                return -myReplyInfo.getReplyTime().compareTo(t1.getReplyTime());
            }
        });
        return toBack;
    }


}
