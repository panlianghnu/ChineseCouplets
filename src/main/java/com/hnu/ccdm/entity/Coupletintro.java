package com.hnu.ccdm.entity;

public class Coupletintro {
    private String coupletsexistedId;

    private String coupletintroOrigin;

    private String coupletintroImage;

    private String coupletintroName;

    public String getCoupletsexistedId() {
        return coupletsexistedId;
    }

    public void setCoupletsexistedId(String coupletsexistedId) {
        this.coupletsexistedId = coupletsexistedId == null ? null : coupletsexistedId.trim();
    }

    public String getCoupletintroOrigin() {
        return coupletintroOrigin;
    }

    public void setCoupletintroOrigin(String coupletintroOrigin) {
        this.coupletintroOrigin = coupletintroOrigin == null ? null : coupletintroOrigin.trim();
    }

    public String getCoupletintroImage() {
        return coupletintroImage;
    }

    public void setCoupletintroImage(String coupletintroImage) {
        this.coupletintroImage = coupletintroImage == null ? null : coupletintroImage.trim();
    }

    public String getCoupletintroName() {
        return coupletintroName;
    }

    public void setCoupletintroName(String coupletintroName) {
        this.coupletintroName = coupletintroName == null ? null : coupletintroName.trim();
    }
}