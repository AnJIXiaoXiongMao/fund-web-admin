package com.fund.web.controller.fund;

import com.fund.common.annotation.Anonymous;
import com.fund.common.core.controller.BaseController;
import com.fund.common.core.domain.AjaxResult;
import com.fund.common.core.page.TableDataInfo;
import com.fund.system.domain.rep.FundNoticeRep;
import com.fund.system.domain.req.FundNoticeReq;
import com.fund.system.service.IFundNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 基金公告 前端控制器
 * </p>
 *
 * @author yangkai
 * @since 2023-11-28
 */
@RestController
@RequestMapping("/fundNotice")
public class FundNoticeController extends BaseController {
    @Autowired
    private IFundNoticeService fundNoticeService;

    private static void inputStreamToFile(InputStream ins, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("getFundInfoNotice")
    @ResponseBody
    public AjaxResult getFundInfoNotice(@RequestParam(value = "fundCode") String fundCode) {
        return success(fundNoticeService.getFundInfoNotice(fundCode));
    }

    @PostMapping(value = "add")
    @ResponseBody
    public AjaxResult add(@RequestBody FundNoticeReq fundNoticeReq) {
        return success(fundNoticeService.add(fundNoticeReq));
    }

    @PutMapping(value = "update")
    @ResponseBody
    public AjaxResult update(@RequestBody FundNoticeReq fundNoticeReq) {
        return success(fundNoticeService.update(fundNoticeReq));
    }

    @DeleteMapping("/del/{id}")
    public AjaxResult del(@PathVariable String id) {
        return success(fundNoticeService.del(id));
    }

    @RequestMapping("list")
    @ResponseBody
    public TableDataInfo getFundNoticeList(FundNoticeReq fundNotice) {
        startPage();
        List<FundNoticeRep> list = fundNoticeService.getFundNoticeList(fundNotice);
        return getDataTable(list);
    }

    @GetMapping(value = "/getFundNotice/{id}")
    public AjaxResult getFundNotice(@PathVariable String id) {
        return success(fundNoticeService.getFundNoticeById(id));
    }

    @PostMapping(value = "upload")
    @ResponseBody
    @Anonymous
    public AjaxResult upload(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            String fileName = file.getOriginalFilename();
            String path = "/Users/yangkai/IdeaProjects/fund-web/static/img/notice";
            File fileDir = new File(path);
            if (!fileDir.exists()) {
                fileDir.setWritable(true);
                fileDir.mkdirs();
            }
            if (fileName != null) {
                File toFile = new File(path + File.separator + fileName);
                InputStream ins;
                try {
                    ins = file.getInputStream();
                    inputStreamToFile(ins, toFile);
                    ins.close();
                } catch (IOException e) {
                    return error("上传异常，请联系管理员");
                }
            }
            Map<String, String> map = new HashMap<>(1);
            map.put("photo", fileName);
            return success(map);
        }
        return error("上传异常，请联系管理员");
    }
}
