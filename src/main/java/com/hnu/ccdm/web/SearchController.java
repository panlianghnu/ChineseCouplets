package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.Coupletsexisted;
import com.hnu.ccdm.entity.Lable;
import com.hnu.ccdm.entity.Post;
import com.hnu.ccdm.entity.User;
import com.hnu.ccdm.service.CoupletsExistedService;
import com.hnu.ccdm.service.PostService;
import com.hnu.ccdm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {
    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    @Autowired
    private CoupletsExistedService coupletsExistedService;

    @ResponseBody
    @RequestMapping("search")
    public List search(String content){
        List<User> userList=userService.getUserList();
        List<Post> postList=postService.getPostList();
        List<Coupletsexisted> coupletsexistedList=coupletsExistedService.getCoupletList();


        content=content.replace(" ","");
        List toback=new ArrayList();
        for (User x:userList){
            if (x.getUserNickname().contains(content)){
                toback.add(x);
            }
        }

        for (Post x:postList){
            if (x.getPostTitle().contains(content)||x.getPostContent().contains(content)||x.getLableContent().contains(content)){
                toback.add(x);
            }
        }

        for (Coupletsexisted x:coupletsexistedList){
            if (x.getCoupletsexistedTitle().contains(content)||x.getCoupletsexistedUpcouplets().contains(content)||x.getCoupletsexistedDowncouplets().contains(content)){
                toback.add(x);
            }
        }
        return toback;
    }
}
