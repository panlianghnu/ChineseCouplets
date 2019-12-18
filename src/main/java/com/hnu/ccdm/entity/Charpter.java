package com.hnu.ccdm.entity;

public class Charpter {
    private String charpterid;

    private String charptername;

    private String charpterstudyid;

    private String charpternumber;

    private String charptercontent;

    public String getCharpterid() {
        return charpterid;
    }

    public void setCharpterid(String charpterid) {
        this.charpterid = charpterid == null ? null : charpterid.trim();
    }

    public String getCharptername() {
        return charptername;
    }

    public void setCharptername(String charptername) {
        this.charptername = charptername == null ? null : charptername.trim();
    }

    public String getCharpterstudyid() {
        return charpterstudyid;
    }

    public void setCharpterstudyid(String charpterstudyid) {
        this.charpterstudyid = charpterstudyid == null ? null : charpterstudyid.trim();
    }

    public String getCharpternumber() {
        return charpternumber;
    }

    public void setCharpternumber(String charpternumber) {
        this.charpternumber = charpternumber == null ? null : charpternumber.trim();
    }

    public String getCharptercontent() {
        return charptercontent;
    }

    public void setCharptercontent(String charptercontent) {
        this.charptercontent = charptercontent == null ? null : charptercontent.trim();
    }
}