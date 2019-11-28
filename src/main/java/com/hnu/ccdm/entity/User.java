package com.hnu.ccdm.entity;

import java.util.Date;

public class User {
    private String userAccount;

    private String userPassword;

    private String userPortrait;

    private String userNickname;

    private String userName;

    private Integer userAge;

    private Date userBirthday;

    private String userLocation;

    private String userPlace;

    private String userLabel;

    private String userEmail;

    private String userNumber;

    private Date userTime;

    private String userVip;

    private String userOfassociation;

    private Date userDate;

    private Integer userScore;

    private String userHonoraryofmember;

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPortrait() {
        return userPortrait;
    }

    public void setUserPortrait(String userPortrait) {
        this.userPortrait = userPortrait == null ? null : userPortrait.trim();
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation == null ? null : userLocation.trim();
    }

    public String getUserPlace() {
        return userPlace;
    }

    public void setUserPlace(String userPlace) {
        this.userPlace = userPlace == null ? null : userPlace.trim();
    }

    public String getUserLabel() {
        return userLabel;
    }

    public void setUserLabel(String userLabel) {
        this.userLabel = userLabel == null ? null : userLabel.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber == null ? null : userNumber.trim();
    }

    public Date getUserTime() {
        return userTime;
    }

    public void setUserTime(Date userTime) {
        this.userTime = userTime;
    }

    public String getUserVip() {
        return userVip;
    }

    public void setUserVip(String userVip) {
        this.userVip = userVip == null ? null : userVip.trim();
    }

    public String getUserOfassociation() {
        return userOfassociation;
    }

    public void setUserOfassociation(String userOfassociation) {
        this.userOfassociation = userOfassociation == null ? null : userOfassociation.trim();
    }

    public Date getUserDate() {
        return userDate;
    }

    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }

    public Integer getUserScore() {
        return userScore;
    }

    public void setUserScore(Integer userScore) {
        this.userScore = userScore;
    }

    public String getUserHonoraryofmember() {
        return userHonoraryofmember;
    }

    public void setUserHonoraryofmember(String userHonoraryofmember) {
        this.userHonoraryofmember = userHonoraryofmember == null ? null : userHonoraryofmember.trim();
    }
}