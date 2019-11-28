package com.hnu.ccdm.entity;

import java.util.Date;

public class Sqsl {
    private String sqslSqbh;

    private String adminId;

    private String rhsqSqid;

    private Boolean sqslShzt;

    private Boolean sqslShjg;

    private String sqslShrid;

    private Date sqslShsj;

    private Boolean sqslZxzt;

    private Date sqslZxsj;

    private String sqslZxrid;

    public String getSqslSqbh() {
        return sqslSqbh;
    }

    public void setSqslSqbh(String sqslSqbh) {
        this.sqslSqbh = sqslSqbh == null ? null : sqslSqbh.trim();
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public String getRhsqSqid() {
        return rhsqSqid;
    }

    public void setRhsqSqid(String rhsqSqid) {
        this.rhsqSqid = rhsqSqid == null ? null : rhsqSqid.trim();
    }

    public Boolean getSqslShzt() {
        return sqslShzt;
    }

    public void setSqslShzt(Boolean sqslShzt) {
        this.sqslShzt = sqslShzt;
    }

    public Boolean getSqslShjg() {
        return sqslShjg;
    }

    public void setSqslShjg(Boolean sqslShjg) {
        this.sqslShjg = sqslShjg;
    }

    public String getSqslShrid() {
        return sqslShrid;
    }

    public void setSqslShrid(String sqslShrid) {
        this.sqslShrid = sqslShrid == null ? null : sqslShrid.trim();
    }

    public Date getSqslShsj() {
        return sqslShsj;
    }

    public void setSqslShsj(Date sqslShsj) {
        this.sqslShsj = sqslShsj;
    }

    public Boolean getSqslZxzt() {
        return sqslZxzt;
    }

    public void setSqslZxzt(Boolean sqslZxzt) {
        this.sqslZxzt = sqslZxzt;
    }

    public Date getSqslZxsj() {
        return sqslZxsj;
    }

    public void setSqslZxsj(Date sqslZxsj) {
        this.sqslZxsj = sqslZxsj;
    }

    public String getSqslZxrid() {
        return sqslZxrid;
    }

    public void setSqslZxrid(String sqslZxrid) {
        this.sqslZxrid = sqslZxrid == null ? null : sqslZxrid.trim();
    }
}