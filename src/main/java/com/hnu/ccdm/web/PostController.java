package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.*;
import com.hnu.ccdm.service.PostService;
import com.hnu.ccdm.service.ReplyService;
import com.hnu.ccdm.service.UserService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/post")

public class PostController {
    @Autowired
    private PostService postService;

    @Autowired
    private ReplyService replyService;

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("getPostById")
    Post getPostById(String id){
        return postService.getPostById(id);
    }

    @ResponseBody
    @RequestMapping("getPostList")

    List<Post> getPostList(){
        return postService.getPostList();
    }

    @ResponseBody
    @RequestMapping("/getTenPosts")
    List<Post> getTenPosts(String num){
        int index = Integer.valueOf(num);
        List<Post> list = postService.getPostList();
        if(list.size() <= index){
            return null;
        }
        List<Post> toBack = new LinkedList<>();
        //从index开始  ， 传最多10个帖子过去
        for(int i=index ; i<list.size() && i < index+10 ; i++){
            toBack.add( list.get(i) );
        }
        return toBack;
    }

    @ResponseBody
    @RequestMapping("/getTenPostsWithAuthor")
    List<PostWithAuthor> getTenPostsWithAuthor(String num){
        int index = Integer.valueOf(num);
        List<Post> list = postService.getPostList();
        if(list.size() <= index){
            return null;
        }
        List<PostWithAuthor> toBack = new LinkedList<>();
        List<User> userList = userService.getUserList();                  // 从userList中找到发帖的人
        //从index开始  ， 传最多10个帖子过去
        for(int i=index ; i<list.size() && i < index+10 ; i++){
            Post item = list.get(i);                                          // 读取帖子信息
            PostWithAuthor postWithAuthor = new PostWithAuthor();             // 临时变量
            postWithAuthor.setPostId(item.getPostId());                       // 帖子ID
            postWithAuthor.setPostContent(item.getPostContent());             // 帖子内容
            postWithAuthor.setPostIsessence(item.getPostIsessence());         // 是否加精
            postWithAuthor.setPostPsum(item.getPostPsum());                   // 点赞量
            postWithAuthor.setPostRsum(item.getPostRsum());                   // 回复量
            postWithAuthor.setPostViewnum(item.getPostViewnum());             // 浏览量
            postWithAuthor.setPostTime(item.getPostTime());                   // 发帖时间
            postWithAuthor.setPostTitle(item.getPostTitle());                 // 帖子标题
            postWithAuthor.setPostTop(item.getPostTop());                     // 是否置顶

            for(User x : userList){
                if(x.getUserAccount().equals(item.getUserAccount())){         // 找到了发帖人， 读取发帖人信息
                    postWithAuthor.setUserAccount(x.getUserAccount());        // 发帖人ID
                    postWithAuthor.setUserNickname(x.getUserNickname());      // 发帖人昵称
                    postWithAuthor.setUserPortrait(x.getUserPortrait());      // 发帖人头像
                    break;
                }
            }
            toBack.add(postWithAuthor);
        }
        return toBack;
    }

    @ResponseBody
    @RequestMapping("getPostReplyByPostId")
    List<ReplyWithResponder> getPostReplyByPostId(String id){
        List<ReplyWithResponder> toBack = new LinkedList<>();
        List<Reply> replyList = replyService.getReplyList();
        List<User> userList = userService.getUserList();
        for(Reply x : replyList){
            if(x.getPostId().equals(id)){                  //从ReplyList中找出postId为传入的postId的
                ReplyWithResponder replyWithResponder = new ReplyWithResponder(); // 读取回复信息
                                                                                  //
                replyWithResponder.setPostId(x.getPostId());                      // 帖子ID
                replyWithResponder.setReplyId(x.getReplyId());                    // 回复ID
                replyWithResponder.setReplyContent(x.getReplyContent());          // 回复内容
                replyWithResponder.setReplyTime(x.getReplyTime());                // 回复时间
                replyWithResponder.setUserAccount(x.getUserAccount());            // 用户ID
                // 根据 UserAccount 寻找 UserNickName 和 UserPortrait
                for(User y : userList){                                           //
                    if(y.getUserAccount().equals(x.getUserAccount())){            //
                        replyWithResponder.setUserNickname(y.getUserNickname());  // 用户昵称
                        replyWithResponder.setUserPortrait(y.getUserPortrait());  // 用户头像
                    }
                }
                toBack.add(replyWithResponder);
            }
        }
        Collections.sort(toBack);
        return toBack;
    }


    @ResponseBody
    @RequestMapping("getPostsByAuthorId")
    List<Post> getPostsByAuthorId(String id){
        List<Post> list = postService.getPostList();
        List<Post> toBack = new LinkedList<>();
        for(Post x : list){
            if(x.getUserAccount().equals(id))
                toBack.add(x);
        }
        return toBack;
    }

    @ResponseBody
    @RequestMapping("deletePostById")
    String deletePostById(String id){
        if(postService.deletePostById(id)>0)
            return "成功";
        //删除了post之后一定要删除收藏表
        return "删除失败";
    }

    @ResponseBody
    @RequestMapping("releasePost")
    String releasePost(String userId, String title , String content, String label){
        Post post = new Post();
        post.setUserAccount(userId);
        post.setPostTitle(title);
        post.setPostContent(content);
        post.setPostTime(new Date());
        post.setPostPsum(0);
        post.setPostRsum(0);
        post.setPostViewnum(0);
        post.setPostId(userId+(new Date().getTime()));
/*        //获取当前时间  (时间戳转字符串)
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Date().getTime();
        Date date = new Date(lt);
        String timeNow = simpleDateFormat.format(date);*/

        switch (label){
            case "楹联鉴赏":post.setLableContent("1");break;
            case "凤求凰":post.setLableContent("3");break;
            default: post.setLableContent("2");break;
        }
        if(postService.addPost(post) > 0)
            return "发贴成功";
        return "发帖失败";
    }

    @ResponseBody
    @RequestMapping("reply")
    String reply(String userId, String postId, String content){
        Reply reply = new Reply();
        reply.setPostId(postId);
        reply.setUserAccount(userId);
        reply.setReplyTime(new Date());
        reply.setReplyContent(content);
        reply.setReplyId(userId+(new Date().getTime()));
        if(replyService.addReply(reply) > 0)
            return "回复成功";
        return "回复失败";
    }

}
