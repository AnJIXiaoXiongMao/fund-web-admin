package com.fund.system.domain;

import com.fund.common.core.domain.BaseEntity;

import java.util.Date;

public class FundNotice extends BaseEntity {
    private Integer id;

    private String title;

    private String type;

    private String path;

    private Date publishdate;

    private Date addtime;

    private String status;

    public FundNotice(Integer id, String title, String type, String path, Date publishdate, Date addtime, String status) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.path = path;
        this.publishdate = publishdate;
        this.addtime = addtime;
        this.status = status;
    }

    public FundNotice() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}