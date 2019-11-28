package com.hnu.ccdm.entity;

import java.util.Date;

public class Associationprofile {
    private String associationprofileId;

    private String adminId;

    private String associationNo;

    private Date associationprofileTime;

    private String associationprofileContent;

    public String getAssociationprofileId() {
        return associationprofileId;
    }

    public void setAssociationprofileId(String associationprofileId) {
        this.associationprofileId = associationprofileId == null ? null : associationprofileId.trim();
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public String getAssociationNo() {
        return associationNo;
    }

    public void setAssociationNo(String associationNo) {
        this.associationNo = associationNo == null ? null : associationNo.trim();
    }

    public Date getAssociationprofileTime() {
        return associationprofileTime;
    }

    public void setAssociationprofileTime(Date associationprofileTime) {
        this.associationprofileTime = associationprofileTime;
    }

    public String getAssociationprofileContent() {
        return associationprofileContent;
    }

    public void setAssociationprofileContent(String associationprofileContent) {
        this.associationprofileContent = associationprofileContent == null ? null : associationprofileContent.trim();
    }
}