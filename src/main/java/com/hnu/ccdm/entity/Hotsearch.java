package com.hnu.ccdm.entity;

import java.util.Date;

public class Hotsearch {
    private String hotsearchid;

    private String hotsearchkeywords;

    private Date hotsearchtime;

    private Integer hotsearchnumber;

    public String getHotsearchid() {
        return hotsearchid;
    }

    public void setHotsearchid(String hotsearchid) {
        this.hotsearchid = hotsearchid == null ? null : hotsearchid.trim();
    }

    public String getHotsearchkeywords() {
        return hotsearchkeywords;
    }

    public void setHotsearchkeywords(String hotsearchkeywords) {
        this.hotsearchkeywords = hotsearchkeywords == null ? null : hotsearchkeywords.trim();
    }

    public Date getHotsearchtime() {
        return hotsearchtime;
    }

    public void setHotsearchtime(Date hotsearchtime) {
        this.hotsearchtime = hotsearchtime;
    }

    public Integer getHotsearchnumber() {
        return hotsearchnumber;
    }

    public void setHotsearchnumber(Integer hotsearchnumber) {
        this.hotsearchnumber = hotsearchnumber;
    }
}