package com.hnu.ccdm.entity;

import java.util.Date;

public class Integral {
    private String integralId;

    private Integer integralSum;

    private String integralSource;

    private Date integralTime;

    private String integralSourceId;

    private String userAccount;

    public String getIntegralId() {
        return integralId;
    }

    public void setIntegralId(String integralId) {
        this.integralId = integralId == null ? null : integralId.trim();
    }

    public Integer getIntegralSum() {
        return integralSum;
    }

    public void setIntegralSum(Integer integralSum) {
        this.integralSum = integralSum;
    }

    public String getIntegralSource() {
        return integralSource;
    }

    public void setIntegralSource(String integralSource) {
        this.integralSource = integralSource == null ? null : integralSource.trim();
    }

    public Date getIntegralTime() {
        return integralTime;
    }

    public void setIntegralTime(Date integralTime) {
        this.integralTime = integralTime;
    }

    public String getIntegralSourceId() {
        return integralSourceId;
    }

    public void setIntegralSourceId(String integralSourceId) {
        this.integralSourceId = integralSourceId == null ? null : integralSourceId.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }
}