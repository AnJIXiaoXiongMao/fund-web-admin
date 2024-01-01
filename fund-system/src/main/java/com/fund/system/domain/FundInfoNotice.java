package com.fund.system.domain;

public class FundInfoNotice {
    private String fundCode;

    private Integer noticeId;

    public FundInfoNotice(String fundCode, Integer noticeId) {
        this.fundCode = fundCode;
        this.noticeId = noticeId;
    }

    public FundInfoNotice() {
        super();
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }
}