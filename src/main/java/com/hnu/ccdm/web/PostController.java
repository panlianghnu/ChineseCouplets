package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.*;
import com.hnu.ccdm.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/post")

public class PostController {
    @Autowired
    private PostService postService;

    @Autowired
    private ReplyService replyService;

    @Autowired
    private UserService userService;

    @Autowired
    private UserlikeKeyService userlikeKeyService;

    @Autowired
    private IntegralService integralService;

    @Autowired
    private Collection1Service collection1Service;

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
            postWithAuthor.setLabelContent(item.getLableContent());           // 标签ID

            for(User x : userList){
                if(x.getUserAccount().equals(item.getUserAccount())){         // 找到了发帖人， 读取发帖人信息
                    postWithAuthor.setUserAccount(x.getUserAccount());        // 发帖人ID
                    postWithAuthor.setUserNickname(x.getUserNickname());      // 发帖人昵称
                    postWithAuthor.setUserPortrait(x.getUserPortrait());      // 发帖人头像
                    postWithAuthor.setUserLabel(x.getUserLabel());
                    break;
                }
            }
            toBack.add(postWithAuthor);
        }
        return toBack;
    }

    @ResponseBody
    @RequestMapping("getPostReplyByPostId")             //postDetail  浏览量会+1
    List<ReplyWithResponder> getPostReplyByPostId(String id){
        postService.viewNumAutoIncrease(id);
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
        boolean flag = false;
        List<Post> postList = postService.getPostList();
        for(Post x : postList){
            if(x.getPostId().equals(id)){
                flag = true;
            }
        }
        if(flag){
            //删除所有收藏
            List<Collection1> collection1List = collection1Service.getCollectionList();
            for(Collection1 x : collection1List){
                if(x.getCollectionPostsid().equals(id)){   //保存所有收藏这个帖子的表中对象
                    collection1Service.deleteCollectionById(x.getCollectionId());
                }
            }
            //删除所有点赞
            List<UserlikeKey> userlikeKeyList = userlikeKeyService.getUserLikeList();
            for(UserlikeKey x : userlikeKeyList){
                if(x.getPostid().equals(id)){
                    userlikeKeyService.deleteUserLike(x.getUseraccount(),x.getPostid());
                }
            }
            //删除所有回复
            List<Reply> replyList = replyService.getReplyList();
            for(Reply x :replyList){
                if(x.getPostId().equals(id)){
                    replyService.deleteReplyById(x.getReplyId());
                }
            }
            postService.deletePostById(id);
            return "成功";
        }
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
        if(postService.addPost(post) > 0){
            addScore(userId,"10","10");      //发帖加10分  sourceId=10
            return "发贴成功";
        }

        return "发帖失败";
    }

    @ResponseBody
    @RequestMapping("reply")
    String reply(String userId, String postId, String content){
        Date date = new Date();
        Reply reply = new Reply();
        reply.setPostId(postId);
        reply.setUserAccount(userId);
        reply.setReplyTime(date);
        reply.setReplyContent(content);
        reply.setReplyId(userId+date.getTime()); // 回复ID由 userId+date.getTime() 构成
        if(replyService.addReply(reply) > 0){            //回复成功，帖子的回复量+1
            postService.rSumAutoIncrease(postId);
            addScore(userId,"1","1");      //回复的sourceId 定义为 1
            return "回复成功";
        }
        return "回复失败";
    }

    @ResponseBody
    @RequestMapping("cancelReply")
    String cancelReply(String replyId){
        Reply reply = replyService.getReplyById(replyId);
        if(replyService.deleteReplyById(replyId) > 0){
            postService.rSumAutoDecrease(reply.getPostId());
            return "删除回复成功";
        }
        return "删除回复失败";
    }

    @ResponseBody
    @RequestMapping("like")
    String likePost(String userId, String postId){
        if(userlikeKeyService.addUserLike(userId,postId) > 0){
            postService.pSumAutoIncrease(postId);
            return "点赞成功";

        }

        return "点赞失败";
    }

    @ResponseBody
    @RequestMapping("cancelLike")
    String cancelLike(String userId, String postId){
        if(userlikeKeyService.deleteUserLike(userId,postId) > 0){
            postService.pSumAutoDecrease(postId);
            return "取消点赞成功";
        }

        return "取消点赞失败";
    }

    @ResponseBody
    @RequestMapping("/judgeUserLike")
    String judgeUserLike(String userId, String postId){
        List<UserlikeKey> userlikeKeyList = userlikeKeyService.getUserLikeList();
        for(UserlikeKey x : userlikeKeyList){
            if(x.getPostid().equals(postId) && x.getUseraccount().equals(userId)){
                return "已点赞";
            }
        }
        return "未点赞";
    }

    @ResponseBody
    @RequestMapping("/getUserLikeList")
    List<PostWithAuthor> getUserLikeList(String account){
        List<UserlikeKey> userlikeKeyList=userlikeKeyService.getUserLikeList();
        List<Post> postList=postService.getPostList();
        List<User> userList=userService.getUserList();
        List<PostWithAuthor> toback=new ArrayList<>();
        for (UserlikeKey x:userlikeKeyList){
            if (x.getUseraccount().equals(account)){
                for (Post y:postList){
                    if (x.getPostid().equals(y.getPostId())){
                        PostWithAuthor postWithAuthor = new PostWithAuthor();             // 临时变量
                        postWithAuthor.setPostId(y.getPostId());                       // 帖子ID
                        postWithAuthor.setPostContent(y.getPostContent());             // 帖子内容
                        postWithAuthor.setPostIsessence(y.getPostIsessence());         // 是否加精
                        postWithAuthor.setPostPsum(y.getPostPsum());                   // 点赞量
                        postWithAuthor.setPostRsum(y.getPostRsum());                   // 回复量
                        postWithAuthor.setPostViewnum(y.getPostViewnum());             // 浏览量
                        postWithAuthor.setPostTime(y.getPostTime());                   // 发帖时间
                        postWithAuthor.setPostTitle(y.getPostTitle());                 // 帖子标题
                        postWithAuthor.setPostTop(y.getPostTop());                     // 是否置顶
                        postWithAuthor.setLabelContent(y.getLableContent());           // 标签ID

                        for(User z : userList){
                            if(z.getUserAccount().equals(y.getUserAccount())){         // 找到了发帖人， 读取发帖人信息
                                postWithAuthor.setUserAccount(z.getUserAccount());        // 发帖人ID
                                postWithAuthor.setUserNickname(z.getUserNickname());      // 发帖人昵称
                                postWithAuthor.setUserPortrait(z.getUserPortrait());      // 发帖人头像
                                postWithAuthor.setUserLabel(z.getUserLabel());
                                break;
                            }
                        }
                        toback.add(postWithAuthor);
                    }
                }
            }
        }
        return toback;
    }

    String addScore(String account,String score,String source){
        List<User> userList=userService.getUserList();
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
                return "增加积分成功";
            }
        }
        return "增加积分失败";
    }
}
