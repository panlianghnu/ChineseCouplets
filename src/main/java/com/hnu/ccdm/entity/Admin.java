package com.hnu.ccdm.entity;

import java.util.Date;

public class Admin {
    private String adminId;

    private String adminUsername;

    private String adminAccesslevel;

    private String adminAssociationno;

    private String adminName;

    private String adminSex;

    private String adminRegion;

    private Date adminBirthday2;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername == null ? null : adminUsername.trim();
    }

    public String getAdminAccesslevel() {
        return adminAccesslevel;
    }

    public void setAdminAccesslevel(String adminAccesslevel) {
        this.adminAccesslevel = adminAccesslevel == null ? null : adminAccesslevel.trim();
    }

    public String getAdminAssociationno() {
        return adminAssociationno;
    }

    public void setAdminAssociationno(String adminAssociationno) {
        this.adminAssociationno = adminAssociationno == null ? null : adminAssociationno.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminSex() {
        return adminSex;
    }

    public void setAdminSex(String adminSex) {
        this.adminSex = adminSex == null ? null : adminSex.trim();
    }

    public String getAdminRegion() {
        return adminRegion;
    }

    public void setAdminRegion(String adminRegion) {
        this.adminRegion = adminRegion == null ? null : adminRegion.trim();
    }

    public Date getAdminBirthday2() {
        return adminBirthday2;
    }

    public void setAdminBirthday2(Date adminBirthday2) {
        this.adminBirthday2 = adminBirthday2;
    }
}