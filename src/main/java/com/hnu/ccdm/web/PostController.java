package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.Post;
import com.hnu.ccdm.service.PostService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/post")

public class PostController {
    @Autowired
    private PostService postService;

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

}
