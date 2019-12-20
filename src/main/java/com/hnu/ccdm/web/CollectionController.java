package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.*;
import com.hnu.ccdm.service.Collection1Service;
import com.hnu.ccdm.service.PostService;
import com.hnu.ccdm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.*;


@Controller
@RequestMapping("/collection")
public class CollectionController {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Collection1Service collection1Service;

    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getCollectionList")
    List<PostWithAuthor> getCollectionList(String account){
        List<Collection1> collection1List=collection1Service.getCollectionList();
        Collections.sort(collection1List, new Comparator<Collection1>() {
            @Override
            public int compare(Collection1 collection1, Collection1 t1) {
                return -collection1.getCollectionCollectdate().compareTo(t1.getCollectionCollectdate());
            }
        });
        List<Post> postList=postService.getPostList();
        List<User> userList=userService.getUserList();
        List<PostWithAuthor> toback=new ArrayList<>();
        for (Collection1 x:collection1List){
            if (x.getUserAccount().equals(account)){
                for (Post y:postList){
                    if (x.getCollectionPostsid().equals(y.getPostId())){
                        PostWithAuthor postWithAuthor = new PostWithAuthor();          // 临时变量
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
                                postWithAuthor.setUserVip(z.getUserVip());
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

    @ResponseBody
    @RequestMapping("/addCollection")
    public String addCollection(String account,String postId){      //postId是帖子ID       postAccount是帖子作者
        Collection1 collection1=new Collection1();

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String collectDate=df.format(new Date());
        String collectionId=account+collectDate;
        String postAccount="";

        List<Post> postList=postService.getPostList();
        for (Post x:postList){
            if (x.getPostId().equals(postId)){
                postAccount=x.getUserAccount();
                break;
            }
        }

        collection1.setCollectionCollectdate(new Date());
        collection1.setCollectionPostaccount(postAccount);
        collection1.setCollectionPostsid(postId);
        collection1.setCollectionId(collectionId);
        collection1.setUserAccount(account);

        if (collection1Service.addCollection(collection1)>0){
            return "添加收藏成功";
        }
        return "添加收藏失败";
    }

    @ResponseBody
    @RequestMapping("/deleteCollection")
    public String deleteCollection(String account,String postId){
        List<Collection1> collection1List=collection1Service.getCollectionList();
        for (Collection1 x:collection1List){
            if (x.getUserAccount().equals(account)&&x.getCollectionPostsid().equals(postId)){
                collection1Service.deleteCollectionById(x.getCollectionId());
                return "删除收藏成功";
            }
        }
        return "删除收藏失败";
    }
    @ResponseBody
    @RequestMapping("/judgeCollection")
    public String judgeCollecion(String account,String postId){
        List<Collection1> collection1List=collection1Service.getCollectionList();
        for(Collection1 x:collection1List){
            if (postId.equals(x.getCollectionPostsid())&&account.equals(x.getUserAccount()))
                return "已收藏";
        }
        return "未收藏";
    }
}
