package com.hnu.ccdm.entity;

public class AssociationAdmin8Key {
    private String adminId;

    private String associationNo;

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
}