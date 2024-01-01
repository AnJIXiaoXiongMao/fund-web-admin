package com.fund.system.domain;

public class FundInfoManager {
    private String fundCode;

    private Integer managerId;

    public FundInfoManager(String fundCode, Integer managerId) {
        this.fundCode = fundCode;
        this.managerId = managerId;
    }

    public FundInfoManager() {
        super();
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}