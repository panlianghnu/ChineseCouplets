package com.hnu.ccdm.entity;

import java.util.Date;

public class Sign {
    private String signId;

    private String signAccount;

    private Date signDate;

    public String getSignId() {
        return signId;
    }

    public void setSignId(String signId) {
        this.signId = signId == null ? null : signId.trim();
    }

    public String getSignAccount() {
        return signAccount;
    }

    public void setSignAccount(String signAccount) {
        this.signAccount = signAccount == null ? null : signAccount.trim();
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }
}