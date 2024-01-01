package com.fund.system.domain;

import com.fund.common.core.domain.BaseEntity;

public class FundManager extends BaseEntity {
    private Integer id;

    private String managerName;

    private String jobTime;

    private String qualification;

    private String biographicalNotes;

    private String photo;

    public FundManager(Integer id, String managerName, String jobTime, String qualification, String biographicalNotes) {
        this.id = id;
        this.managerName = managerName;
        this.jobTime = jobTime;
        this.qualification = qualification;
        this.biographicalNotes = biographicalNotes;
    }

    public FundManager(Integer id, String managerName, String jobTime, String qualification, String biographicalNotes, String photo) {
        this.id = id;
        this.managerName = managerName;
        this.jobTime = jobTime;
        this.qualification = qualification;
        this.biographicalNotes = biographicalNotes;
        this.photo = photo;
    }

    public FundManager() {
        super();
    }

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
        this.managerName = managerName == null ? null : managerName.trim();
    }

    public String getJobTime() {
        return jobTime;
    }

    public void setJobTime(String jobTime) {
        this.jobTime = jobTime == null ? null : jobTime.trim();
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification == null ? null : qualification.trim();
    }

    public String getBiographicalNotes() {
        return biographicalNotes;
    }

    public void setBiographicalNotes(String biographicalNotes) {
        this.biographicalNotes = biographicalNotes == null ? null : biographicalNotes.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }
}