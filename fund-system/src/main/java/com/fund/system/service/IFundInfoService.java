package com.fund.system.service;


import com.fund.system.domain.FundInfo;
import com.fund.system.domain.req.FundInfoReq;

import java.util.List;

/**
 * <p>
 * 基金表 服务类
 * </p>
 *
 * @author yangkai
 * @since 2023-11-28
 */
public interface IFundInfoService {
    String add(FundInfoReq fundInfoReq);

    String update(FundInfoReq fundInfoReq);

    List<FundInfo> getFundInfoList(FundInfo fundInfo);

    String del(String fundCode);

    FundInfo getFundInfo(String fundCode);
}
