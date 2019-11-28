package com.hnu.ccdm.entity;

public class ClassificationCoupletsbyuser24Key {
    private String coupletsbyuserId;

    private String classificationClassificationid;

    public String getCoupletsbyuserId() {
        return coupletsbyuserId;
    }

    public void setCoupletsbyuserId(String coupletsbyuserId) {
        this.coupletsbyuserId = coupletsbyuserId == null ? null : coupletsbyuserId.trim();
    }

    public String getClassificationClassificationid() {
        return classificationClassificationid;
    }

    public void setClassificationClassificationid(String classificationClassificationid) {
        this.classificationClassificationid = classificationClassificationid == null ? null : classificationClassificationid.trim();
    }
}