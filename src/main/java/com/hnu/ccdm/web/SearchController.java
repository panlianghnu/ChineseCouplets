package com.hnu.ccdm.web;

import com.hnu.ccdm.entity.*;
import com.hnu.ccdm.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("search")
public class SearchController {
    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    @Autowired
    private CoupletsExistedService coupletsExistedService;

    @Autowired
    private LabelService labelService;

    @Autowired
    private ClassificationService classificationService;

    @Autowired
    private ClassificationCoupletsexisted23KeyService classificationCoupletsexisted23KeyService;

    @ResponseBody
    @RequestMapping("searchUser")
    public List searchUser(String searchContent){
        List<User> userList=userService.getUserList();
        searchContent=searchContent.replace(" ","");
        List toback=new ArrayList();
        for (User x:userList){
            if (x.getUserNickname().contains(searchContent)||x.getUserAccount().contains(searchContent)){
                toback.add(x);
            }
        }
        return toback;
    }

    @ResponseBody
    @RequestMapping("searchPost")
    public List<Post> searchPost(String searchContent){
        List<Post> postList=postService.getPostList();
        List<Lable> lableList=labelService.getLabelList();
        searchContent=searchContent.replace(" ","");
        List<Post> toback=new ArrayList();
        for (Post x:postList){
            if (x.getPostTitle().contains(searchContent)||x.getPostContent().contains(searchContent)){
                toback.add(x);
                continue;
            }
            for (Lable y:lableList){
                if (x.getLableContent().equals(y.getLableContent())){
                    if (y.getLableName().contains(searchContent)){
                        toback.add(x);
                    }
                }
            }
        }
        return toback;
    }

    @ResponseBody
    @RequestMapping("searchCouplets")
    public List<Coupletsexisted> searchCouplets(String searchContent){
        searchContent=searchContent.replace(" ","");
        List<Coupletsexisted> coupletsexistedList=coupletsExistedService.getCoupletList();
        List<Classification> classificationList=classificationService.getClassificationList();
        List<ClassificationCoupletsexisted23Key> classificationCoupletsexisted23KeyList=classificationCoupletsexisted23KeyService.getClassificationWithCouplets();
        List<Coupletsexisted> toback=new ArrayList<Coupletsexisted>();
        for (Coupletsexisted x:coupletsexistedList){
            if (x.getCoupletsexistedTitle().contains(searchContent)||x.getCoupletsexistedUpcouplets().contains(searchContent)||x.getCoupletsexistedDowncouplets().contains(searchContent)){
                toback.add(x);
                break;
            }
            for (ClassificationCoupletsexisted23Key y:classificationCoupletsexisted23KeyList){
                if (x.getCoupletsexistedId().equals(y.getCoupletsexistedId()))
                    for (Classification z:classificationList){
                        if (y.getClassificationClassificationid().equals(z.getClassificationClassificationid())){
                            if (z.getClassificationClassificationname().contains(searchContent)){
                                toback.add(x);
                            }
                        }
                    }
            }
        }
        return toback;
    }

    @ResponseBody
    @RequestMapping("searchLabel")
    public List<Lable> searchLabel(String searchContent){
        List<Lable> lableList=labelService.getLabelList();
        List<Lable> toback=new ArrayList<>();
        for (Lable x:lableList){
            if (x.getLableName().contains(searchContent)){
                toback.add(x);
            }
        }
        return toback;
    }

    @ResponseBody
    @RequestMapping("searchClassificion")
    public List<Classification> searchClassifiction(String searchContent){
        List<Classification> classificationList=classificationService.getClassificationList();
        List<Classification> toback=new ArrayList<>();

        for (Classification x:classificationList){
            if (x.getClassificationClassificationname().contains(searchContent)){
                toback.add(x);
            }
        }
        return toback;
    }

}
