package com.fund.system.domain.rep;

import java.io.Serializable;

/**
 * <p>
 * 基金表
 * </p>
 *
 * @author yangkai
 * @since 2023-11-28
 */
public class FundInfoRep implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer fundId;
    /**
     * 基金代码
     */
    private String fundCode;

    /**
     * 基金名称
     */
    private String fundName;

    /**
     * 成立日期
     */
    private String inceptionDate;

    /**
     * 管理费
     */
    private Double managementFee;

    /**
     * 认购费
     */
    private Double subscriptionFee;

    /**
     * 转换费
     */
    private Double switchingFee;

    /**
     * 赎回费
     */
    private Double redemptionFee;

    /**
     * 基金状态
     */
    private String status;

    /**
     * 基金类型
     */
    private String type;

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getInceptionDate() {
        return inceptionDate;
    }

    public void setInceptionDate(String inceptionDate) {
        this.inceptionDate = inceptionDate;
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
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getFundId() {
        return fundId;
    }

    public void setFundId(Integer fundId) {
        this.fundId = fundId;
    }
}
