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
import java.util.Date;
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

    @Autowired
    private HotSearchService hotSearchService;

    public void updateKeyWords(String searchContent){

        List<Hotsearch> hotsearchList=hotSearchService.getHotSearchList();
        System.out.println(hotsearchList.size());
        if (hotsearchList.isEmpty()){
            Hotsearch hotsearch=new Hotsearch();
            int number = (int)(Math.random()*10000)+1;
            hotsearch.setHotsearchid(String.valueOf(number)+new Date());
            hotsearch.setHotsearchkeywords(searchContent);
            hotsearch.setHotsearchtime(new Date());
            hotsearch.setHotsearchnumber(1);
            hotSearchService.addHotSearch(hotsearch);
            return;
        }
        for (Hotsearch x:hotsearchList){
            if (x.getHotsearchkeywords().contains(searchContent)){
                x.setHotsearchnumber(x.getHotsearchnumber()+1);
                hotSearchService.updateByPrimarKey(x);
                return;
            }
            else if (searchContent.contains(x.getHotsearchkeywords())){
                x.setHotsearchnumber(x.getHotsearchnumber()+1);
                x.setHotsearchkeywords(searchContent);
                hotSearchService.updateByPrimarKey(x);
                return;
            }


        }
        Hotsearch hotsearch=new Hotsearch();
        int number = (int)(Math.random()*10000)+1;
        hotsearch.setHotsearchid(String.valueOf(number)+new Date());
        hotsearch.setHotsearchkeywords(searchContent);
        hotsearch.setHotsearchtime(new Date());
        hotsearch.setHotsearchnumber(1);
        hotSearchService.addHotSearch(hotsearch);
        return;
    }

    @ResponseBody
    @RequestMapping("searchUser")
    public List searchUser(String searchContent) {
        if (searchContent.isEmpty()){
            return new ArrayList();
        }
        updateKeyWords(searchContent);
        List<User> userList = userService.getUserList();
        searchContent = searchContent.replace(" ", "");
        //System.out.println(searchContent);
        List toback = new ArrayList();
        for (User x : userList) {
            if (x.getUserNickname().contains(searchContent) || x.getUserAccount().contains(searchContent) || (x.getUserName() != null && x.getUserName().contains(searchContent))) {
                toback.add(x);
            }
        }
        return toback;
    }

    @ResponseBody
    @RequestMapping("searchPost")
    public List<PostWithAuthor> searchPost(String searchContent) {
        if (searchContent.isEmpty()){
            return new ArrayList();
        }
        updateKeyWords(searchContent);
        List<Post> postList = postService.getPostList();
        List<Lable> lableList = labelService.getLabelList();
        List<User> userList = userService.getUserList();
        searchContent = searchContent.replace(" ", "");
        List<PostWithAuthor> toback = new ArrayList();
        for (Post x : postList) {
            User user = userService.getUserByAccount(x.getUserAccount());
            //System.out.println(user.getUserAccount());
            //匹配帖子的标题，内容,作者的姓名，作者的昵称
            if (x.getPostTitle().contains(searchContent) || x.getPostContent().contains(searchContent)
                || (user.getUserName()!=null && user.getUserName().contains(searchContent)) || user.getUserNickname().contains(searchContent)) {
                PostWithAuthor postWithAuthor = new PostWithAuthor();             // 临时变量
                postWithAuthor.setPostId(x.getPostId());                       // 帖子ID
                postWithAuthor.setPostContent(x.getPostContent());             // 帖子内容
                postWithAuthor.setPostIsessence(x.getPostIsessence());         // 是否加精
                postWithAuthor.setPostPsum(x.getPostPsum());                   // 点赞量
                postWithAuthor.setPostRsum(x.getPostRsum());                   // 回复量
                postWithAuthor.setPostViewnum(x.getPostViewnum());             // 浏览量
                postWithAuthor.setPostTime(x.getPostTime());                   // 发帖时间
                postWithAuthor.setPostTitle(x.getPostTitle());                 // 帖子标题
                postWithAuthor.setPostTop(x.getPostTop());                     // 是否置顶
                postWithAuthor.setLabelContent(x.getLableContent());           // 标签ID

                for (User z : userList) {
                    if (z.getUserAccount().equals(x.getUserAccount())) {         // 找到了发帖人， 读取发帖人信息
                        postWithAuthor.setUserVip(z.getUserVip());
                        postWithAuthor.setUserAccount(z.getUserAccount());        // 发帖人ID
                        postWithAuthor.setUserNickname(z.getUserNickname());      // 发帖人昵称
                        postWithAuthor.setUserPortrait(z.getUserPortrait());      // 发帖人头像
                        postWithAuthor.setUserLabel(z.getUserLabel());
                        break;
                    }
                }
                toback.add(postWithAuthor);
                continue;
            }
            for (Lable y : lableList) {
                if (x.getLableContent().equals(y.getLableContent())) {
                    if (y.getLableName().contains(searchContent)) {
                        PostWithAuthor postWithAuthor = new PostWithAuthor();             // 临时变量
                        postWithAuthor.setPostId(x.getPostId());                       // 帖子ID
                        postWithAuthor.setPostContent(x.getPostContent());             // 帖子内容
                        postWithAuthor.setPostIsessence(x.getPostIsessence());         // 是否加精
                        postWithAuthor.setPostPsum(x.getPostPsum());                   // 点赞量
                        postWithAuthor.setPostRsum(x.getPostRsum());                   // 回复量
                        postWithAuthor.setPostViewnum(x.getPostViewnum());             // 浏览量
                        postWithAuthor.setPostTime(x.getPostTime());                   // 发帖时间
                        postWithAuthor.setPostTitle(x.getPostTitle());                 // 帖子标题
                        postWithAuthor.setPostTop(x.getPostTop());                     // 是否置顶
                        postWithAuthor.setLabelContent(x.getLableContent());           // 标签ID

                        for (User z : userList) {
                            if (z.getUserAccount().equals(x.getUserAccount())) {         // 找到了发帖人， 读取发帖人信息
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
    @RequestMapping("searchCouplets")
    public List<Coupletsexisted> searchCouplets(String searchContent) {
        if (searchContent.isEmpty()){
            return new ArrayList();
        }
        updateKeyWords(searchContent);
        searchContent = searchContent.replace(" ", "");
        List<Coupletsexisted> coupletsexistedList = coupletsExistedService.getCoupletList();
        List<Classification> classificationList = classificationService.getClassificationList();
        List<ClassificationCoupletsexisted23Key> classificationCoupletsexisted23KeyList = classificationCoupletsexisted23KeyService.getClassificationWithCouplets();
        List<Coupletsexisted> toback = new ArrayList<Coupletsexisted>();
        for (Coupletsexisted x : coupletsexistedList) {
            if (x.getCoupletsexistedTitle().contains(searchContent) || x.getCoupletsexistedUpcouplets().contains(searchContent) || x.getCoupletsexistedDowncouplets().contains(searchContent)) {
                toback.add(x);
                break;
            }
            for (ClassificationCoupletsexisted23Key y : classificationCoupletsexisted23KeyList) {
                if (x.getCoupletsexistedId().equals(y.getCoupletsexistedId()))
                    for (Classification z : classificationList) {
                        if (y.getClassificationClassificationid().equals(z.getClassificationClassificationid())) {
                            if (z.getClassificationClassificationname().contains(searchContent)) {
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
    public List<PostWithAuthor> searchLabel(String searchContent) {

        if (searchContent.isEmpty()){
            return new ArrayList();
        }
        updateKeyWords(searchContent);
        List<Post> postList = postService.getPostList();
        List<Lable> lableList = labelService.getLabelList();
        List<User> userList = userService.getUserList();
        searchContent = searchContent.replace(" ", "");
        List<PostWithAuthor> toback = new ArrayList();
        for (Post x : postList) {
            for (Lable y : lableList) {
                if (x.getLableContent().equals(y.getLableContent())) {
                    if (y.getLableName().contains(searchContent)) {
                        PostWithAuthor postWithAuthor = new PostWithAuthor();             // 临时变量
                        postWithAuthor.setPostId(x.getPostId());                       // 帖子ID
                        postWithAuthor.setPostContent(x.getPostContent());             // 帖子内容
                        postWithAuthor.setPostIsessence(x.getPostIsessence());         // 是否加精
                        postWithAuthor.setPostPsum(x.getPostPsum());                   // 点赞量
                        postWithAuthor.setPostRsum(x.getPostRsum());                   // 回复量
                        postWithAuthor.setPostViewnum(x.getPostViewnum());             // 浏览量
                        postWithAuthor.setPostTime(x.getPostTime());                   // 发帖时间
                        postWithAuthor.setPostTitle(x.getPostTitle());                 // 帖子标题
                        postWithAuthor.setPostTop(x.getPostTop());                     // 是否置顶
                        postWithAuthor.setLabelContent(x.getLableContent());           // 标签ID

                        for (User z : userList) {
                            if (z.getUserAccount().equals(x.getUserAccount())) {         // 找到了发帖人， 读取发帖人信息
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
    @RequestMapping("searchClassificion")
    public List<Coupletsexisted> searchClassifiction(String searchContent) {
        if (searchContent.isEmpty()){
            return new ArrayList();
        }
        updateKeyWords(searchContent);
        List<Classification> classificationList = classificationService.getClassificationList();
        List<Coupletsexisted> toback = new ArrayList<>();
        List<Coupletsexisted> coupletsexistedList = coupletsExistedService.getCoupletList();
        List<ClassificationCoupletsexisted23Key> classificationCoupletsexisted23KeyList = classificationCoupletsexisted23KeyService.getClassificationWithCouplets();
        for (Coupletsexisted x : coupletsexistedList) {
            for (ClassificationCoupletsexisted23Key y : classificationCoupletsexisted23KeyList) {
                if (x.getCoupletsexistedId().equals(y.getCoupletsexistedId())) {
                    for (Classification z : classificationList) {
                        if (z.getClassificationClassificationid().equals(y.getClassificationClassificationid())) {
                            if (z.getClassificationClassificationname().contains(searchContent)) {
                                toback.add(x);
                            }
                        }
                    }
                }
            }
        }
        return toback;
    }

}
