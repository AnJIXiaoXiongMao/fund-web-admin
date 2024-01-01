package com.fund.system.mapper;


import com.fund.system.domain.FundInfo;

import java.util.List;

public interface FundInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(FundInfo row);

    int insertSelective(FundInfo row);

    FundInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(FundInfo row);

    int updateByPrimaryKey(FundInfo row);

    int getCount(String fundCode);

    List<FundInfo> selectFundInfoList(FundInfo row);
}