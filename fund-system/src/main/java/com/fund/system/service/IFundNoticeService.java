package com.fund.system.service;


import com.fund.system.domain.FundNotice;
import com.fund.system.domain.rep.FundNoticeRep;
import com.fund.system.domain.req.FundNoticeReq;

import java.util.List;

/**
 * <p>
 * 基金公告 服务类
 * </p>
 *
 * @author yangkai
 * @since 2023-11-28
 */
public interface IFundNoticeService{
    List<FundNoticeRep> getFundInfoNotice(String fundCode);
    String add(FundNoticeReq fundNoticeReq);
    String update(FundNoticeReq fundNoticeReq);
    List<FundNoticeRep> getFundNoticeList(FundNoticeReq fundNotice);
    FundNoticeRep getFundNoticeById(String id);
    String del(String id);
}
