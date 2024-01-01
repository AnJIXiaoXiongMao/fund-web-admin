package com.fund.system.mapper;


import com.fund.system.domain.FundInfoNotice;

public interface FundInfoNoticeMapper {
    int insert(FundInfoNotice row);

    int insertSelective(FundInfoNotice row);
    int update(FundInfoNotice row);
}