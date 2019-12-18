package com.hnu.ccdm.entity;

public class Study {
    private String studyid;

    private String studyauthor;

    private String studyname;

    private String studyphoto;

    private String studyintroduction;

    public String getStudyid() {
        return studyid;
    }

    public void setStudyid(String studyid) {
        this.studyid = studyid == null ? null : studyid.trim();
    }

    public String getStudyauthor() {
        return studyauthor;
    }

    public void setStudyauthor(String studyauthor) {
        this.studyauthor = studyauthor == null ? null : studyauthor.trim();
    }

    public String getStudyname() {
        return studyname;
    }

    public void setStudyname(String studyname) {
        this.studyname = studyname == null ? null : studyname.trim();
    }

    public String getStudyphoto() {
        return studyphoto;
    }

    public void setStudyphoto(String studyphoto) {
        this.studyphoto = studyphoto == null ? null : studyphoto.trim();
    }

    public String getStudyintroduction() {
        return studyintroduction;
    }

    public void setStudyintroduction(String studyintroduction) {
        this.studyintroduction = studyintroduction == null ? null : studyintroduction.trim();
    }
}