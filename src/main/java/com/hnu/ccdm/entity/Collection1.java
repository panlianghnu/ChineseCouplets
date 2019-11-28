package com.hnu.ccdm.entity;

import java.util.Date;

public class Collection1 {
    private String collectionId;

    private String collectionPostaccount;

    private Integer collectionPostsid;

    private Date collectionCollectdate;

    private String userAccount;

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId == null ? null : collectionId.trim();
    }

    public String getCollectionPostaccount() {
        return collectionPostaccount;
    }

    public void setCollectionPostaccount(String collectionPostaccount) {
        this.collectionPostaccount = collectionPostaccount == null ? null : collectionPostaccount.trim();
    }

    public Integer getCollectionPostsid() {
        return collectionPostsid;
    }

    public void setCollectionPostsid(Integer collectionPostsid) {
        this.collectionPostsid = collectionPostsid;
    }

    public Date getCollectionCollectdate() {
        return collectionCollectdate;
    }

    public void setCollectionCollectdate(Date collectionCollectdate) {
        this.collectionCollectdate = collectionCollectdate;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }
}