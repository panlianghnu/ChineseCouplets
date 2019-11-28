package com.hnu.ccdm.entity;

public class Classification {
    private String classificationClassificationid;

    private String classificationClassificationname;

    private String classificationClassificationintroduction;

    public String getClassificationClassificationid() {
        return classificationClassificationid;
    }

    public void setClassificationClassificationid(String classificationClassificationid) {
        this.classificationClassificationid = classificationClassificationid == null ? null : classificationClassificationid.trim();
    }

    public String getClassificationClassificationname() {
        return classificationClassificationname;
    }

    public void setClassificationClassificationname(String classificationClassificationname) {
        this.classificationClassificationname = classificationClassificationname == null ? null : classificationClassificationname.trim();
    }

    public String getClassificationClassificationintroduction() {
        return classificationClassificationintroduction;
    }

    public void setClassificationClassificationintroduction(String classificationClassificationintroduction) {
        this.classificationClassificationintroduction = classificationClassificationintroduction == null ? null : classificationClassificationintroduction.trim();
    }
}