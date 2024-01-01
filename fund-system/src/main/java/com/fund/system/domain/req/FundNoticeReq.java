package com.fund.system.domain.req;

import com.fund.common.core.domain.BaseEntity;

import java.io.Serializable;

/**
 * <p>
 * 基金公告
 * </p>
 *
 * @author yangkai
 * @since 2023-11-28
 */
public class FundNoticeReq extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private Integer id;

    /**
     * 公告标题
     */
    private String title;

    /**
     * 公告类型
     */
    private String type;

    /**
     * 文件路径
     */
    private String path;

    /**
     * 生效时间
     */
    private String publishdate;

    /**
     * 创建时间
     */
    private String addtime;

    /**
     * 状态
     */
    private String status;

    private String fundCode;

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
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }
}
