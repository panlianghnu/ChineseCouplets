package com.hnu.ccdm.entity;

public class Lable {
    private String lableContent;

    private String lableName;

    private String lableRemarks;

    public String getLableContent() {
        return lableContent;
    }

    public void setLableContent(String lableContent) {
        this.lableContent = lableContent == null ? null : lableContent.trim();
    }

    public String getLableName() {
        return lableName;
    }

    public void setLableName(String lableName) {
        this.lableName = lableName == null ? null : lableName.trim();
    }

    public String getLableRemarks() {
        return lableRemarks;
    }

    public void setLableRemarks(String lableRemarks) {
        this.lableRemarks = lableRemarks == null ? null : lableRemarks.trim();
    }
}