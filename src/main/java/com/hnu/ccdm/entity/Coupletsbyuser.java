package com.hnu.ccdm.entity;

public class Coupletsbyuser {
    private String coupletsbyuserId;

    private String userAccount;

    private String coupletintroId;

    private String coupletsbyuserUp;

    private String coupletsbyuserDown;

    private String coupletsbyuserTitle;

    private Integer coupletsbyuserStatus;

    private Integer coupletsbyuserViewcount;

    public String getCoupletsbyuserId() {
        return coupletsbyuserId;
    }

    public void setCoupletsbyuserId(String coupletsbyuserId) {
        this.coupletsbyuserId = coupletsbyuserId == null ? null : coupletsbyuserId.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getCoupletintroId() {
        return coupletintroId;
    }

    public void setCoupletintroId(String coupletintroId) {
        this.coupletintroId = coupletintroId == null ? null : coupletintroId.trim();
    }

    public String getCoupletsbyuserUp() {
        return coupletsbyuserUp;
    }

    public void setCoupletsbyuserUp(String coupletsbyuserUp) {
        this.coupletsbyuserUp = coupletsbyuserUp == null ? null : coupletsbyuserUp.trim();
    }

    public String getCoupletsbyuserDown() {
        return coupletsbyuserDown;
    }

    public void setCoupletsbyuserDown(String coupletsbyuserDown) {
        this.coupletsbyuserDown = coupletsbyuserDown == null ? null : coupletsbyuserDown.trim();
    }

    public String getCoupletsbyuserTitle() {
        return coupletsbyuserTitle;
    }

    public void setCoupletsbyuserTitle(String coupletsbyuserTitle) {
        this.coupletsbyuserTitle = coupletsbyuserTitle == null ? null : coupletsbyuserTitle.trim();
    }

    public Integer getCoupletsbyuserStatus() {
        return coupletsbyuserStatus;
    }

    public void setCoupletsbyuserStatus(Integer coupletsbyuserStatus) {
        this.coupletsbyuserStatus = coupletsbyuserStatus;
    }

    public Integer getCoupletsbyuserViewcount() {
        return coupletsbyuserViewcount;
    }

    public void setCoupletsbyuserViewcount(Integer coupletsbyuserViewcount) {
        this.coupletsbyuserViewcount = coupletsbyuserViewcount;
    }
}