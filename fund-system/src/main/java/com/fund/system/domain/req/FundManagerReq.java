package com.fund.system.domain.req;

import com.fund.common.core.domain.BaseEntity;

import java.io.Serializable;

/**
 * <p>
 * 基金经理
 * </p>
 *
 * @author yangkai
 * @since 2023-11-28
 */

public class FundManagerReq extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Integer id;

    /**
     * 基金经理名称
     */
    private String managerName;

    /**
     * 从业时间
     */
    private String jobTime;

    /**
     * 学历
     */
    private String qualification;

    /**
     * 简历
     */
    private String biographicalNotes;

    /**
     * 照片
     */
    private String photo;

    private String fundCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getJobTime() {
        return jobTime;
    }

    public void setJobTime(String jobTime) {
        this.jobTime = jobTime;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getBiographicalNotes() {
        return biographicalNotes;
    }

    public void setBiographicalNotes(String biographicalNotes) {
        this.biographicalNotes = biographicalNotes;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }
}
