package com.hnu.ccdm.entity;

import java.util.Date;

public class ReportAudit {
    private String reportAuditReportno;

    private String userAccount;

    private String reportAuditInformerid;

    private String reportAuditPostid;

    private String reportAuditBreportid;

    private Date reportAuditReporttime;

    private String reportAuditAdminid;

    private String reportAuditReportreason;

    public String getReportAuditReportno() {
        return reportAuditReportno;
    }

    public void setReportAuditReportno(String reportAuditReportno) {
        this.reportAuditReportno = reportAuditReportno == null ? null : reportAuditReportno.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getReportAuditInformerid() {
        return reportAuditInformerid;
    }

    public void setReportAuditInformerid(String reportAuditInformerid) {
        this.reportAuditInformerid = reportAuditInformerid == null ? null : reportAuditInformerid.trim();
    }

    public String getReportAuditPostid() {
        return reportAuditPostid;
    }

    public void setReportAuditPostid(String reportAuditPostid) {
        this.reportAuditPostid = reportAuditPostid == null ? null : reportAuditPostid.trim();
    }

    public String getReportAuditBreportid() {
        return reportAuditBreportid;
    }

    public void setReportAuditBreportid(String reportAuditBreportid) {
        this.reportAuditBreportid = reportAuditBreportid == null ? null : reportAuditBreportid.trim();
    }

    public Date getReportAuditReporttime() {
        return reportAuditReporttime;
    }

    public void setReportAuditReporttime(Date reportAuditReporttime) {
        this.reportAuditReporttime = reportAuditReporttime;
    }

    public String getReportAuditAdminid() {
        return reportAuditAdminid;
    }

    public void setReportAuditAdminid(String reportAuditAdminid) {
        this.reportAuditAdminid = reportAuditAdminid == null ? null : reportAuditAdminid.trim();
    }

    public String getReportAuditReportreason() {
        return reportAuditReportreason;
    }

    public void setReportAuditReportreason(String reportAuditReportreason) {
        this.reportAuditReportreason = reportAuditReportreason == null ? null : reportAuditReportreason.trim();
    }
}