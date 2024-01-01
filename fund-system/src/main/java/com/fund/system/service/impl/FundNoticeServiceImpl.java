package com.fund.system.service.impl;

import com.fund.system.domain.FundInfoNotice;
import com.fund.system.domain.FundNotice;
import com.fund.system.domain.rep.FundNoticeRep;
import com.fund.system.domain.req.FundNoticeReq;
import com.fund.system.eums.FundEnum;
import com.fund.system.mapper.FundInfoNoticeMapper;
import com.fund.system.mapper.FundNoticeMapper;
import com.fund.system.service.IFundNoticeService;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 基金公告 服务实现类
 * </p>
 *
 * @author yangkai
 * @since 2023-11-28
 */
@Service
public class FundNoticeServiceImpl implements IFundNoticeService {
    @Autowired
    private FundInfoNoticeMapper fundInfoNoticeMapper;

    @Autowired
    private FundNoticeMapper fundNoticeMapper;

    @Override
    public List<FundNoticeRep> getFundInfoNotice(String fundCode) {
        List<FundNoticeRep> fundNoticeRepList = fundNoticeMapper.getFundInfoNotice(fundCode);
        for (FundNoticeRep fundNoticeRep : fundNoticeRepList) {
            fundNoticeRep.setType(FundEnum.FundNoticeTypeEnum.codeOf(fundNoticeRep.getType()).getValue());
        }
        return fundNoticeRepList;
    }

    @Override
    public String add(FundNoticeReq fundNoticeReq){
        FundNotice fundNotice = new FundNotice();
        fundNotice.setTitle(fundNoticeReq.getTitle());
        fundNotice.setType(fundNoticeReq.getType());
        fundNotice.setAddtime(new Date());
        fundNotice.setPath(fundNoticeReq.getPath());
        fundNotice.setStatus("1");
        try {
            fundNotice.setPublishdate(new SimpleDateFormat("yyyyMMdd").parse((fundNoticeReq.getPublishdate())));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        int resultCount = fundNoticeMapper.insertSelective(fundNotice);
        if (resultCount > 0) {
            Integer id = fundNotice.getId();
            FundInfoNotice fundInfoNotice = new FundInfoNotice();
            fundInfoNotice.setNoticeId(id);
            fundInfoNotice.setFundCode(fundNoticeReq.getFundCode());
            fundInfoNoticeMapper.insert(fundInfoNotice);
            return "添加成功";
        }
        return "添加失败";
    }

    @Override
    public String update(FundNoticeReq fundNoticeReq) {
        FundNotice fundNotice = new FundNotice();
        BeanUtils.copyProperties(fundNoticeReq, fundNotice);
        int resultCount = fundNoticeMapper.updateByPrimaryKeySelective(fundNotice);
        if (resultCount>0) {
            FundInfoNotice fundInfoNotice = new FundInfoNotice();
            fundInfoNotice.setFundCode(fundNoticeReq.getFundCode());
            fundInfoNotice.setNoticeId(fundNoticeReq.getId());
            fundInfoNoticeMapper.update(fundInfoNotice);
            return "添加成功";
        }
        return "添加失败";
    }

    @Override
    public List<FundNoticeRep> getFundNoticeList(FundNoticeReq fundNotice) {
        return fundNoticeMapper.getFundNoticeList(fundNotice);
    }

    @Override
    public FundNoticeRep getFundNoticeById(String id) {
        return fundNoticeMapper.getFundNoticeById(id);
    }

    @Override
    public String del(String id) {
        int resultCount = fundNoticeMapper.deleteByPrimaryKey(Integer.valueOf(id));
        if (resultCount > 0) {
            return "删除成功";
        }
        return "删除失败";
    }
}
