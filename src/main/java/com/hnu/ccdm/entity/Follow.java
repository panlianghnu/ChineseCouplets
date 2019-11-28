package com.hnu.ccdm.entity;

import java.util.Date;

public class Follow {
    private String followFollowedaccount;

    private String userAccount;

    private Date followFollowtime;

    public String getFollowFollowedaccount() {
        return followFollowedaccount;
    }

    public void setFollowFollowedaccount(String followFollowedaccount) {
        this.followFollowedaccount = followFollowedaccount == null ? null : followFollowedaccount.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public Date getFollowFollowtime() {
        return followFollowtime;
    }

    public void setFollowFollowtime(Date followFollowtime) {
        this.followFollowtime = followFollowtime;
    }
}