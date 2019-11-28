package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.Collection1;
import com.hnu.ccdm.entity.Post;
import com.hnu.ccdm.service.Collection1Service;
import com.hnu.ccdm.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


@Controller
@RequestMapping("/collection")
public class CollectionController {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Collection1Service collection1Service;

    @Autowired
    private PostService postService;

    @ResponseBody
    @RequestMapping("/getCollectionPostsByUserId")//通过账号返回收藏
    List<Post> getCollectionPostsByUserId(String id){
        List<Post> toBack=new LinkedList<>();
        List<Collection1> collectionList=collection1Service.getCollectionList();
        List<Post> postList=postService.getPostList();
        LOG.info(""+collectionList.size());
        LOG.info(""+postList.size());
        for(Collection1 x:collectionList)
        {
            if(x.getUserAccount().equals(id))
            {
                for(Post y:postList)
                {
                    String postId=String.valueOf(x.getCollectionPostsid());
                    if(y.getPostId().equals(postId))
                    {
                        toBack.add(y);
                        break;
                    }
                }
            }
        }
        return toBack;
    }

    @ResponseBody
    @RequestMapping("/addCollection")
    public String addCollection(String account,String postId){
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
        collection1.setCollectionPostsid(Integer.valueOf(postId));
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
            if (x.getUserAccount().equals(account)&&x.getCollectionPostsid()==Integer.valueOf(postId)){
                collection1Service.deleteCollectionById(x.getCollectionId());
                return "删除收藏成功";
            }
        }
        return "删除收藏失败";
    }
}
