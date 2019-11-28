package com.hnu.ccdm.entity;

public class Coupletsauthor {
    private String coupletsauthorId;

    private String coupletsauthorName;

    private String coupletsauthorSex;

    private String coupletsauthorDynasty;

    private String coupletsauthorStyle;

    private String coupletsauthorRemarks;

    public String getCoupletsauthorId() {
        return coupletsauthorId;
    }

    public void setCoupletsauthorId(String coupletsauthorId) {
        this.coupletsauthorId = coupletsauthorId == null ? null : coupletsauthorId.trim();
    }

    public String getCoupletsauthorName() {
        return coupletsauthorName;
    }

    public void setCoupletsauthorName(String coupletsauthorName) {
        this.coupletsauthorName = coupletsauthorName == null ? null : coupletsauthorName.trim();
    }

    public String getCoupletsauthorSex() {
        return coupletsauthorSex;
    }

    public void setCoupletsauthorSex(String coupletsauthorSex) {
        this.coupletsauthorSex = coupletsauthorSex == null ? null : coupletsauthorSex.trim();
    }

    public String getCoupletsauthorDynasty() {
        return coupletsauthorDynasty;
    }

    public void setCoupletsauthorDynasty(String coupletsauthorDynasty) {
        this.coupletsauthorDynasty = coupletsauthorDynasty == null ? null : coupletsauthorDynasty.trim();
    }

    public String getCoupletsauthorStyle() {
        return coupletsauthorStyle;
    }

    public void setCoupletsauthorStyle(String coupletsauthorStyle) {
        this.coupletsauthorStyle = coupletsauthorStyle == null ? null : coupletsauthorStyle.trim();
    }

    public String getCoupletsauthorRemarks() {
        return coupletsauthorRemarks;
    }

    public void setCoupletsauthorRemarks(String coupletsauthorRemarks) {
        this.coupletsauthorRemarks = coupletsauthorRemarks == null ? null : coupletsauthorRemarks.trim();
    }
}