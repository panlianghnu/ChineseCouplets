package com.hnu.ccdm.entity;

public class RhsqWithBLOBs extends Rhsq {
    private String rhsqSqyy;

    private byte[] rhsqFj;

    public String getRhsqSqyy() {
        return rhsqSqyy;
    }

    public void setRhsqSqyy(String rhsqSqyy) {
        this.rhsqSqyy = rhsqSqyy == null ? null : rhsqSqyy.trim();
    }

    public byte[] getRhsqFj() {
        return rhsqFj;
    }

    public void setRhsqFj(byte[] rhsqFj) {
        this.rhsqFj = rhsqFj;
    }
}