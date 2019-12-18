package com.hnu.ccdm.entity;

import java.util.Date;

public class PostWithAuthor {
    private String postId;

    private String userAccount;

    private String userNickname;

    private String userPortrait;

    private String userVip;

    private String labelContent;

    private Date postTime;

    private Integer postPsum;

    private Integer postRsum;

    private String postTitle;

    private Integer postViewnum;

    private Boolean postIsessence;

    private Boolean postTop;

    private String postContent;

    private String userLabel;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserPortrait() {
        return userPortrait;
    }

    public void setUserPortrait(String userPortrait) {
        this.userPortrait = userPortrait;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public String getLabelContent() {
        return labelContent;
    }

    public void setLabelContent(String labelContent) {
        this.labelContent = labelContent;
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
        this.postTitle = postTitle;
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
        this.postContent = postContent;
    }

    public String getUserLabel() {
        return userLabel;
    }

    public void setUserLabel(String userLabel) {
        this.userLabel = userLabel;
    }

    public String getUserVip() {
        return userVip;
    }

    public void setUserVip(String userVip) {
        this.userVip = userVip;
    }
}
