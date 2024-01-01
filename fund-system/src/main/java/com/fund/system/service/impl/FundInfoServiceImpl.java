package com.fund.system.service.impl;

import com.fund.system.domain.FundInfo;
import com.fund.system.domain.req.FundInfoReq;
import com.fund.system.eums.FundEnum;
import com.fund.system.mapper.FundInfoMapper;
import com.fund.system.service.IFundInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 基金表 服务实现类
 * </p>
 *
 * @author yangkai
 * @since 2023-11-28
 */
@Service
public class FundInfoServiceImpl implements IFundInfoService {
    @Autowired
    private FundInfoMapper fundInfoMapper;

    @Override
    public String add(FundInfoReq fundInfoReq) {
        long count = fundInfoMapper.getCount(fundInfoReq.getFundCode());
        if (count > 0) {
            return "基金代码重复，请检查";
        } else {
            FundInfo fundInfo = new FundInfo();
            fundInfo.setFundCode(fundInfoReq.getFundCode());
            fundInfo.setFundName(fundInfoReq.getFundName());
            fundInfo.setStatus(fundInfoReq.getStatus());
            fundInfo.setType(fundInfoReq.getType());
            fundInfo.setInceptionDate(fundInfoReq.getInceptionDate());
            fundInfo.setManagementFee(Double.valueOf(fundInfoReq.getManagementFee()));
            fundInfo.setRedemptionFee(Double.valueOf(fundInfoReq.getRedemptionFee()));
            fundInfo.setSubscriptionFee(Double.valueOf(fundInfoReq.getSubscriptionFee()));
            fundInfo.setSwitchingFee(Double.valueOf(fundInfoReq.getSwitchingFee()));
            int resultCount = fundInfoMapper.insertSelective(fundInfo);
            if (resultCount > 0) {
                return "添加成功";
            }
            return "添加失败";
        }
    }

    @Override
    public String update(FundInfoReq fundInfoReq) {
        long count = fundInfoMapper.getCount(fundInfoReq.getFundCode());
        if (count == 0) {
            return "未查询到基金";
        } else {
            FundInfo fundInfo = new FundInfo();
            fundInfo.setFundId(fundInfoReq.getFundId());
            fundInfo.setFundCode(fundInfoReq.getFundCode());
            fundInfo.setFundName(fundInfoReq.getFundName());
            fundInfo.setStatus(fundInfoReq.getStatus());
            fundInfo.setType(fundInfoReq.getType());
            fundInfo.setInceptionDate(fundInfoReq.getInceptionDate());
            fundInfo.setManagementFee(Double.valueOf(fundInfoReq.getManagementFee()));
            fundInfo.setRedemptionFee(Double.valueOf(fundInfoReq.getRedemptionFee()));
            fundInfo.setSubscriptionFee(Double.valueOf(fundInfoReq.getSubscriptionFee()));
            fundInfo.setSwitchingFee(Double.valueOf(fundInfoReq.getSwitchingFee()));
            int resultCount = fundInfoMapper.updateByPrimaryKeySelective(fundInfo);
            if (resultCount > 0) {
                return "更新成功";
            }
            return "更新失败";
        }
    }

    @Override
    public List<FundInfo> getFundInfoList(FundInfo fundInfo) {
        return fundInfoMapper.selectFundInfoList(fundInfo);
    }

    @Override
    public String del(String fundCode) {
        long count = fundInfoMapper.getCount(fundCode);
        if (count == 0) {
            return "未查询到基金";
        } else {
            int resultCount = fundInfoMapper.deleteByPrimaryKey(fundCode);
            if (resultCount > 0) {
                return "删除成功";
            }
            return "删除失败";
        }
    }

    @Override
    public FundInfo getFundInfo(String fundCode) {
        return fundInfoMapper.selectByPrimaryKey(fundCode);
    }
}
