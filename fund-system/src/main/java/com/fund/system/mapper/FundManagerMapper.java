package com.fund.system.mapper;


import com.fund.system.domain.FundManager;
import com.fund.system.domain.rep.FundManagerRep;
import com.fund.system.domain.req.FundManagerReq;

import java.util.List;

public interface FundManagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FundManager row);

    int insertSelective(FundManager row);

    FundManager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FundManager row);

    int updateByPrimaryKeyWithBLOBs(FundManager row);

    int updateByPrimaryKey(FundManager row);

    List<FundManagerRep> getFundManager(String fundCode);

    List<FundManagerRep> getFundManagerList(FundManagerReq row);

    FundManagerRep getFundManagerById(String id);
}