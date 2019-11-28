package com.hnu.ccdm.entity;

public class Searchhistory {
    private String viewhistoryId;

    private String userAccount;

    private String viewhistoryContent;

    public String getViewhistoryId() {
        return viewhistoryId;
    }

    public void setViewhistoryId(String viewhistoryId) {
        this.viewhistoryId = viewhistoryId == null ? null : viewhistoryId.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getViewhistoryContent() {
        return viewhistoryContent;
    }

    public void setViewhistoryContent(String viewhistoryContent) {
        this.viewhistoryContent = viewhistoryContent == null ? null : viewhistoryContent.trim();
    }
}