package com.fund.system.domain;

import com.fund.common.core.domain.BaseEntity;

public class FundInfo extends BaseEntity {
    private Integer fundId;
    private String fundCode;

    private String fundName;

    private String inceptionDate;

    private Double managementFee;

    private Double subscriptionFee;

    private Double switchingFee;

    private Double redemptionFee;

    private String status;

    private String type;

    public Integer getFundId() {
        return fundId;
    }

    public void setFundId(Integer fundId) {
        this.fundId = fundId;
    }

    public FundInfo() {
        super();
    }

    public FundInfo(Integer fundId, String fundCode, String fundName, String inceptionDate, Double managementFee, Double subscriptionFee, Double switchingFee, Double redemptionFee, String status, String type) {
        this.fundId = fundId;
        this.fundCode = fundCode;
        this.fundName = fundName;
        this.inceptionDate = inceptionDate;
        this.managementFee = managementFee;
        this.subscriptionFee = subscriptionFee;
        this.switchingFee = switchingFee;
        this.redemptionFee = redemptionFee;
        this.status = status;
        this.type = type;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName == null ? null : fundName.trim();
    }

    public String getInceptionDate() {
        return inceptionDate;
    }

    public void setInceptionDate(String inceptionDate) {
        this.inceptionDate = inceptionDate == null ? null : inceptionDate.trim();
    }

    public Double getManagementFee() {
        return managementFee;
    }

    public void setManagementFee(Double managementFee) {
        this.managementFee = managementFee;
    }

    public Double getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setSubscriptionFee(Double subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public Double getSwitchingFee() {
        return switchingFee;
    }

    public void setSwitchingFee(Double switchingFee) {
        this.switchingFee = switchingFee;
    }

    public Double getRedemptionFee() {
        return redemptionFee;
    }

    public void setRedemptionFee(Double redemptionFee) {
        this.redemptionFee = redemptionFee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}