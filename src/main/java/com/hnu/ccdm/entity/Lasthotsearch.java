package com.hnu.ccdm.entity;

import java.util.Date;

public class Lasthotsearch {
    private String lasthotsearchid;

    private Date lasthotsearchtime;

    public String getLasthotsearchid() {
        return lasthotsearchid;
    }

    public void setLasthotsearchid(String lasthotsearchid) {
        this.lasthotsearchid = lasthotsearchid == null ? null : lasthotsearchid.trim();
    }

    public Date getLasthotsearchtime() {
        return lasthotsearchtime;
    }

    public void setLasthotsearchtime(Date lasthotsearchtime) {
        this.lasthotsearchtime = lasthotsearchtime;
    }
}