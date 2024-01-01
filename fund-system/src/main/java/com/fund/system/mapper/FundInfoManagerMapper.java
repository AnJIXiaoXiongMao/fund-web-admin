package com.fund.system.mapper;


import com.fund.system.domain.FundInfoManager;

public interface FundInfoManagerMapper {
    int insert(FundInfoManager row);

    int insertSelective(FundInfoManager row);

    int update(FundInfoManager row);
}