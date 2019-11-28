package com.hnu.ccdm.entity;

import java.util.Date;

public class Message {
    private String messageMessageid;

    private String messageTitle;

    private String messageReceiverid;

    private String adminId;

    private String messageSenderid;

    private Date messageTime;

    private String messageContain;

    public String getMessageMessageid() {
        return messageMessageid;
    }

    public void setMessageMessageid(String messageMessageid) {
        this.messageMessageid = messageMessageid == null ? null : messageMessageid.trim();
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle == null ? null : messageTitle.trim();
    }

    public String getMessageReceiverid() {
        return messageReceiverid;
    }

    public void setMessageReceiverid(String messageReceiverid) {
        this.messageReceiverid = messageReceiverid == null ? null : messageReceiverid.trim();
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public String getMessageSenderid() {
        return messageSenderid;
    }

    public void setMessageSenderid(String messageSenderid) {
        this.messageSenderid = messageSenderid == null ? null : messageSenderid.trim();
    }

    public Date getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    public String getMessageContain() {
        return messageContain;
    }

    public void setMessageContain(String messageContain) {
        this.messageContain = messageContain == null ? null : messageContain.trim();
    }
}