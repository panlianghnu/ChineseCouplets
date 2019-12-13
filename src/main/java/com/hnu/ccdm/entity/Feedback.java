package com.hnu.ccdm.entity;

import java.util.Date;

public class Feedback {
    private String feedbackid;

    private String feedbackaccount;

    private Date feedbacktime;

    private String feedbackcontent;

    public String getFeedbackid() {
        return feedbackid;
    }

    public void setFeedbackid(String feedbackid) {
        this.feedbackid = feedbackid == null ? null : feedbackid.trim();
    }

    public String getFeedbackaccount() {
        return feedbackaccount;
    }

    public void setFeedbackaccount(String feedbackaccount) {
        this.feedbackaccount = feedbackaccount == null ? null : feedbackaccount.trim();
    }

    public Date getFeedbacktime() {
        return feedbacktime;
    }

    public void setFeedbacktime(Date feedbacktime) {
        this.feedbacktime = feedbacktime;
    }

    public String getFeedbackcontent() {
        return feedbackcontent;
    }

    public void setFeedbackcontent(String feedbackcontent) {
        this.feedbackcontent = feedbackcontent == null ? null : feedbackcontent.trim();
    }
}