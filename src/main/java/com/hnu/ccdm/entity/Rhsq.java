package com.hnu.ccdm.entity;

import java.util.Date;

public class Rhsq {
    private String rhsqSqid;

    private String userAccount;

    private String sqslSqbh;

    private String rhsqSqrid;

    private String rhsqZrxhid;

    private Date rhsqSqtjsj;

    public String getRhsqSqid() {
        return rhsqSqid;
    }

    public void setRhsqSqid(String rhsqSqid) {
        this.rhsqSqid = rhsqSqid == null ? null : rhsqSqid.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getSqslSqbh() {
        return sqslSqbh;
    }

    public void setSqslSqbh(String sqslSqbh) {
        this.sqslSqbh = sqslSqbh == null ? null : sqslSqbh.trim();
    }

    public String getRhsqSqrid() {
        return rhsqSqrid;
    }

    public void setRhsqSqrid(String rhsqSqrid) {
        this.rhsqSqrid = rhsqSqrid == null ? null : rhsqSqrid.trim();
    }

    public String getRhsqZrxhid() {
        return rhsqZrxhid;
    }

    public void setRhsqZrxhid(String rhsqZrxhid) {
        this.rhsqZrxhid = rhsqZrxhid == null ? null : rhsqZrxhid.trim();
    }

    public Date getRhsqSqtjsj() {
        return rhsqSqtjsj;
    }

    public void setRhsqSqtjsj(Date rhsqSqtjsj) {
        this.rhsqSqtjsj = rhsqSqtjsj;
    }
}