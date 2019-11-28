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

import java.util.ArrayList;
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


}
