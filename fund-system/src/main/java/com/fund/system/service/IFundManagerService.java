package com.fund.system.service;


import com.fund.system.domain.FundManager;
import com.fund.system.domain.rep.FundManagerRep;
import com.fund.system.domain.req.FundManagerReq;

import java.util.List;

/**
 * <p>
 * 基金经理 服务类
 * </p>
 *
 * @author yangkai
 * @since 2023-11-28
 */
public interface IFundManagerService {
    List<FundManagerRep> getFundInfoManager(String fundCode);

    String add(FundManagerReq fundManagerReq);

    String update(FundManagerReq fundManagerReq);

    List<FundManagerRep> getFundManagerList(FundManagerReq fundManager);

    FundManagerRep getFundManager(String id);

    String del(String id);
}
