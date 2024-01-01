package com.fund.system.service.impl;


import com.fund.system.domain.FundInfoManager;
import com.fund.system.domain.FundManager;
import com.fund.system.domain.rep.FundManagerRep;
import com.fund.system.domain.req.FundManagerReq;
import com.fund.system.mapper.FundInfoManagerMapper;
import com.fund.system.mapper.FundManagerMapper;
import com.fund.system.service.IFundManagerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 基金经理 服务实现类
 * </p>
 *
 * @author yangkai
 * @since 2023-11-28
 */
@Service
public class FundManagerServiceImpl implements IFundManagerService {
    @Autowired
    private FundManagerMapper fundManagerMapper;

    @Autowired
    private FundInfoManagerMapper fundInfoManagerMapper;

    @Override
    public List<FundManagerRep> getFundInfoManager(String fundCode) {
        List<FundManagerRep> fundManagerList = fundManagerMapper.getFundManager(fundCode);
        return fundManagerList;
    }

    @Override
    public String add(FundManagerReq fundManagerReq) {
        FundManager fundManager = new FundManager();
        BeanUtils.copyProperties(fundManagerReq, fundManager);
        int resultCount = fundManagerMapper.insertSelective(fundManager);
        if (resultCount > 0) {
            Integer id = fundManager.getId();
            FundInfoManager fundInfoManager = new FundInfoManager();
            fundInfoManager.setManagerId(id);
            fundInfoManager.setFundCode(fundManagerReq.getFundCode());
            fundInfoManagerMapper.insert(fundInfoManager);
            return "添加成功";
        }
        return "添加失败";
    }

    @Override
    public String update(FundManagerReq fundManagerReq) {
        FundManager fundManager = new FundManager();
        BeanUtils.copyProperties(fundManagerReq, fundManager);
        int resultCount = fundManagerMapper.updateByPrimaryKeySelective(fundManager);
        if (resultCount > 0) {
            FundInfoManager fundInfoManager = new FundInfoManager();
            fundInfoManager.setManagerId(fundManagerReq.getId());
            fundInfoManager.setFundCode(fundManagerReq.getFundCode());
            fundInfoManagerMapper.update(fundInfoManager);
            return "修改成功";
        }
        return "修改失败";
    }

    @Override
    public List<FundManagerRep> getFundManagerList(FundManagerReq fundManager) {
        return fundManagerMapper.getFundManagerList(fundManager);
    }

    @Override
    public FundManagerRep getFundManager(String id) {
        return fundManagerMapper.getFundManagerById(id);
    }

    @Override
    public String del(String id) {
        int resultCount = fundManagerMapper.deleteByPrimaryKey(Integer.valueOf(id));
        if (resultCount > 0) {
            return "删除成功";
        }
        return "删除失败";
    }
}
