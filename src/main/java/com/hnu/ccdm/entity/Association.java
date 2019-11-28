package com.hnu.ccdm.entity;

import java.util.Date;

public class Association {
    private String associationNo;

    private String associationprofileId;

    private String associationName;

    private String associationLocation;

    private String associationManager;

    private Date associationCreatedate;

    private Date associationDeletedate;

    private Integer associationVipnumber;

    private String associationInformation;

    public String getAssociationNo() {
        return associationNo;
    }

    public void setAssociationNo(String associationNo) {
        this.associationNo = associationNo == null ? null : associationNo.trim();
    }

    public String getAssociationprofileId() {
        return associationprofileId;
    }

    public void setAssociationprofileId(String associationprofileId) {
        this.associationprofileId = associationprofileId == null ? null : associationprofileId.trim();
    }

    public String getAssociationName() {
        return associationName;
    }

    public void setAssociationName(String associationName) {
        this.associationName = associationName == null ? null : associationName.trim();
    }

    public String getAssociationLocation() {
        return associationLocation;
    }

    public void setAssociationLocation(String associationLocation) {
        this.associationLocation = associationLocation == null ? null : associationLocation.trim();
    }

    public String getAssociationManager() {
        return associationManager;
    }

    public void setAssociationManager(String associationManager) {
        this.associationManager = associationManager == null ? null : associationManager.trim();
    }

    public Date getAssociationCreatedate() {
        return associationCreatedate;
    }

    public void setAssociationCreatedate(Date associationCreatedate) {
        this.associationCreatedate = associationCreatedate;
    }

    public Date getAssociationDeletedate() {
        return associationDeletedate;
    }

    public void setAssociationDeletedate(Date associationDeletedate) {
        this.associationDeletedate = associationDeletedate;
    }

    public Integer getAssociationVipnumber() {
        return associationVipnumber;
    }

    public void setAssociationVipnumber(Integer associationVipnumber) {
        this.associationVipnumber = associationVipnumber;
    }

    public String getAssociationInformation() {
        return associationInformation;
    }

    public void setAssociationInformation(String associationInformation) {
        this.associationInformation = associationInformation == null ? null : associationInformation.trim();
    }
}