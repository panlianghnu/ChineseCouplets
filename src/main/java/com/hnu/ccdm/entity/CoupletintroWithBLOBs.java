package com.hnu.ccdm.entity;

public class CoupletintroWithBLOBs extends Coupletintro {
    private String coupletintroStory;

    private String coupletintroJsnr;

    public String getCoupletintroStory() {
        return coupletintroStory;
    }

    public void setCoupletintroStory(String coupletintroStory) {
        this.coupletintroStory = coupletintroStory == null ? null : coupletintroStory.trim();
    }

    public String getCoupletintroJsnr() {
        return coupletintroJsnr;
    }

    public void setCoupletintroJsnr(String coupletintroJsnr) {
        this.coupletintroJsnr = coupletintroJsnr == null ? null : coupletintroJsnr.trim();
    }
}