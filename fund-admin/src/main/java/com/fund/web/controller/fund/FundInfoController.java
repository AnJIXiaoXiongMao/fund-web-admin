package com.fund.web.controller.fund;


import com.fund.common.core.controller.BaseController;
import com.fund.common.core.domain.AjaxResult;
import com.fund.common.core.page.TableDataInfo;
import com.fund.system.domain.FundInfo;
import com.fund.system.domain.SysConfig;
import com.fund.system.domain.rep.FundInfoRep;
import com.fund.system.domain.req.FundInfoReq;
import com.fund.system.service.IFundInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 基金表 前端控制器
 * </p>
 *
 * @author yangkai
 * @since 2023-11-28
 */
@RestController
@RequestMapping("/fundInfo")
public class FundInfoController extends BaseController {
    @Autowired
    private IFundInfoService fundInfoService;

    @ResponseBody
    @PostMapping(value = "add")
    public AjaxResult add( @RequestBody FundInfoReq fundInfoReq) {
        return success(fundInfoService.add(fundInfoReq));
    }

    @ResponseBody
    @PutMapping(value ="update" )
    public AjaxResult update(@RequestBody FundInfoReq fundInfoReq) {
        return success(fundInfoService.update(fundInfoReq));
    }

    @RequestMapping("list")
    @ResponseBody
    public TableDataInfo list(FundInfo fundInfo) {
        startPage();
        List<FundInfo> list = fundInfoService.getFundInfoList(fundInfo);
        return getDataTable(list);
    }

    @DeleteMapping("/del/{fundId}")
    public AjaxResult del(@PathVariable String fundId) {
        return success(fundInfoService.del(fundId));
    }

    @GetMapping(value = "/getFundInfo/{fundId}")
    public AjaxResult getFundInfo(@PathVariable String fundId){
        return success(fundInfoService.getFundInfo(fundId));
    }
}
