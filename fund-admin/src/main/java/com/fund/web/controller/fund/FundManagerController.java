package com.fund.web.controller.fund;

import com.fund.common.annotation.Anonymous;
import com.fund.common.core.controller.BaseController;
import com.fund.common.core.domain.AjaxResult;
import com.fund.common.core.page.TableDataInfo;
import com.fund.system.domain.rep.FundManagerRep;
import com.fund.system.domain.req.FundManagerReq;
import com.fund.system.service.IFundManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 基金经理 前端控制器
 * </p>
 *
 * @author yangkai
 * @since 2023-11-28
 */
@RestController
@RequestMapping("/fundManager")
public class FundManagerController extends BaseController {

    @Autowired
    private IFundManagerService fundManagerService;

    //获取流文件
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

    @RequestMapping("getFundInfoManager")
    @ResponseBody
    public AjaxResult fundInfoManager(@RequestParam(value = "fundCode") String fundCode) {
        return success(fundManagerService.getFundInfoManager(fundCode));
    }

    @PostMapping(value = "add")
    @ResponseBody
    public AjaxResult add(@RequestBody FundManagerReq fundManagerReq) {
        return success(fundManagerService.add(fundManagerReq));
    }

    @PutMapping(value = "update")
    @ResponseBody
    public AjaxResult update(@RequestBody FundManagerReq fundManagerReq) {
        return success(fundManagerService.update(fundManagerReq));
    }

    @RequestMapping("list")
    @ResponseBody
    public TableDataInfo getFundManagerList(FundManagerReq fundManager) {
        startPage();
        List<FundManagerRep> list = fundManagerService.getFundManagerList(fundManager);
        return getDataTable(list);
    }

    @DeleteMapping("/del/{id}")
    public AjaxResult del(@PathVariable String id) {
        return success(fundManagerService.del(id));
    }

    @GetMapping(value = "/getFundManager/{id}")
    public AjaxResult getFundManager(@PathVariable String id) {
        return success(fundManagerService.getFundManager(id));
    }

    @PostMapping(value = "upload")
    @ResponseBody
    @Anonymous
    public AjaxResult upload(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            String fileName = file.getOriginalFilename();
            String path = "/Users/yangkai/IdeaProjects/fund-web/static/img/manager";
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
