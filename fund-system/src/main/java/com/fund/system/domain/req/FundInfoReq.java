package com.fund.system.domain.req;

import com.fund.common.core.domain.BaseEntity;

import java.io.Serializable;

/**
 * <p>
 * 基金表
 * </p>
 *
 * @author yangkai
 * @since 2023-11-28
 */
public class FundInfoReq extends BaseEntity implements Serializable {

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
    private String managementFee;

    /**
     * 认购费
     */
    private String subscriptionFee;

    /**
     * 转换费
     */
    private String switchingFee;

    /**
     * 赎回费
     */
    private String redemptionFee;

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

    public String getManagementFee() {
        return managementFee;
    }

    public void setManagementFee(String managementFee) {
        this.managementFee = managementFee;
    }

    public String getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setSubscriptionFee(String subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public String getSwitchingFee() {
        return switchingFee;
    }

    public void setSwitchingFee(String switchingFee) {
        this.switchingFee = switchingFee;
    }

    public String getRedemptionFee() {
        return redemptionFee;
    }

    public void setRedemptionFee(String redemptionFee) {
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
