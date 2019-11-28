package com.hnu.ccdm.entity;

import java.util.Date;

public class Coupletsexisted {
    private String coupletsexistedId;

    private String couCoupletsexistedId;

    private String coupletsexistedTitle;

    private String coupletsexistedUpcouplets;

    private String coupletsexistedDowncouplets;

    private Integer coupletsexistedBrosecount;

    private Date coupletsexistedInputdate;

    public String getCoupletsexistedId() {
        return coupletsexistedId;
    }

    public void setCoupletsexistedId(String coupletsexistedId) {
        this.coupletsexistedId = coupletsexistedId == null ? null : coupletsexistedId.trim();
    }

    public String getCouCoupletsexistedId() {
        return couCoupletsexistedId;
    }

    public void setCouCoupletsexistedId(String couCoupletsexistedId) {
        this.couCoupletsexistedId = couCoupletsexistedId == null ? null : couCoupletsexistedId.trim();
    }

    public String getCoupletsexistedTitle() {
        return coupletsexistedTitle;
    }

    public void setCoupletsexistedTitle(String coupletsexistedTitle) {
        this.coupletsexistedTitle = coupletsexistedTitle == null ? null : coupletsexistedTitle.trim();
    }

    public String getCoupletsexistedUpcouplets() {
        return coupletsexistedUpcouplets;
    }

    public void setCoupletsexistedUpcouplets(String coupletsexistedUpcouplets) {
        this.coupletsexistedUpcouplets = coupletsexistedUpcouplets == null ? null : coupletsexistedUpcouplets.trim();
    }

    public String getCoupletsexistedDowncouplets() {
        return coupletsexistedDowncouplets;
    }

    public void setCoupletsexistedDowncouplets(String coupletsexistedDowncouplets) {
        this.coupletsexistedDowncouplets = coupletsexistedDowncouplets == null ? null : coupletsexistedDowncouplets.trim();
    }

    public Integer getCoupletsexistedBrosecount() {
        return coupletsexistedBrosecount;
    }

    public void setCoupletsexistedBrosecount(Integer coupletsexistedBrosecount) {
        this.coupletsexistedBrosecount = coupletsexistedBrosecount;
    }

    public Date getCoupletsexistedInputdate() {
        return coupletsexistedInputdate;
    }

    public void setCoupletsexistedInputdate(Date coupletsexistedInputdate) {
        this.coupletsexistedInputdate = coupletsexistedInputdate;
    }
}