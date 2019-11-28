package com.hnu.ccdm.entity;

public class IntegralSource {
    private String integralSourceId;

    private String integralSourceSource;

    private String integralSourceIntroduce;

    public String getIntegralSourceId() {
        return integralSourceId;
    }

    public void setIntegralSourceId(String integralSourceId) {
        this.integralSourceId = integralSourceId == null ? null : integralSourceId.trim();
    }

    public String getIntegralSourceSource() {
        return integralSourceSource;
    }

    public void setIntegralSourceSource(String integralSourceSource) {
        this.integralSourceSource = integralSourceSource == null ? null : integralSourceSource.trim();
    }

    public String getIntegralSourceIntroduce() {
        return integralSourceIntroduce;
    }

    public void setIntegralSourceIntroduce(String integralSourceIntroduce) {
        this.integralSourceIntroduce = integralSourceIntroduce == null ? null : integralSourceIntroduce.trim();
    }
}