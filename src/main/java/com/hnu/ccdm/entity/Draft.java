package com.hnu.ccdm.entity;

import java.util.Date;

public class Draft {
    private String draftNo;

    private String adminId;

    private String draftAuthor;

    private Date draftTime;

    private String draftType;

    private String draftTitle;

    private String draftEnclosure;

    private String draftContent;

    public String getDraftNo() {
        return draftNo;
    }

    public void setDraftNo(String draftNo) {
        this.draftNo = draftNo == null ? null : draftNo.trim();
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public String getDraftAuthor() {
        return draftAuthor;
    }

    public void setDraftAuthor(String draftAuthor) {
        this.draftAuthor = draftAuthor == null ? null : draftAuthor.trim();
    }

    public Date getDraftTime() {
        return draftTime;
    }

    public void setDraftTime(Date draftTime) {
        this.draftTime = draftTime;
    }

    public String getDraftType() {
        return draftType;
    }

    public void setDraftType(String draftType) {
        this.draftType = draftType == null ? null : draftType.trim();
    }

    public String getDraftTitle() {
        return draftTitle;
    }

    public void setDraftTitle(String draftTitle) {
        this.draftTitle = draftTitle == null ? null : draftTitle.trim();
    }

    public String getDraftEnclosure() {
        return draftEnclosure;
    }

    public void setDraftEnclosure(String draftEnclosure) {
        this.draftEnclosure = draftEnclosure == null ? null : draftEnclosure.trim();
    }

    public String getDraftContent() {
        return draftContent;
    }

    public void setDraftContent(String draftContent) {
        this.draftContent = draftContent == null ? null : draftContent.trim();
    }
}