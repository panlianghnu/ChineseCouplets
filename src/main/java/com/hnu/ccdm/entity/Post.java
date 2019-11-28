package com.hnu.ccdm.entity;

import java.util.Date;

public class Post {
    private String postId;

    private String userAccount;

    private String lableContent;

    private Date postTime;

    private Integer postPsum;

    private Integer postRsum;

    private String postTitle;

    private String postTag;

    private Integer postViewnum;

    private Boolean postIsessence;

    private Boolean postTop;

    private String postContent;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId == null ? null : postId.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getLableContent() {
        return lableContent;
    }

    public void setLableContent(String lableContent) {
        this.lableContent = lableContent == null ? null : lableContent.trim();
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public Integer getPostPsum() {
        return postPsum;
    }

    public void setPostPsum(Integer postPsum) {
        this.postPsum = postPsum;
    }

    public Integer getPostRsum() {
        return postRsum;
    }

    public void setPostRsum(Integer postRsum) {
        this.postRsum = postRsum;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle == null ? null : postTitle.trim();
    }

    public String getPostTag() {
        return postTag;
    }

    public void setPostTag(String postTag) {
        this.postTag = postTag == null ? null : postTag.trim();
    }

    public Integer getPostViewnum() {
        return postViewnum;
    }

    public void setPostViewnum(Integer postViewnum) {
        this.postViewnum = postViewnum;
    }

    public Boolean getPostIsessence() {
        return postIsessence;
    }

    public void setPostIsessence(Boolean postIsessence) {
        this.postIsessence = postIsessence;
    }

    public Boolean getPostTop() {
        return postTop;
    }

    public void setPostTop(Boolean postTop) {
        this.postTop = postTop;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent == null ? null : postContent.trim();
    }
}