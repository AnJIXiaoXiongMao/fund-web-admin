package com.fund.system.mapper;


import com.fund.system.domain.FundNotice;
import com.fund.system.domain.rep.FundNoticeRep;
import com.fund.system.domain.req.FundNoticeReq;

import java.util.List;

public interface FundNoticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FundNotice row);

    int insertSelective(FundNotice row);

    FundNotice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FundNotice row);

    int updateByPrimaryKey(FundNotice row);

    List<FundNoticeRep> getFundInfoNotice(String fundCode);

    List<FundNoticeRep> getFundNoticeList(FundNoticeReq row);

    FundNoticeRep getFundNoticeById(String id);

}