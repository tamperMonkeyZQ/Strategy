package com.sut.strategy.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sut.strategy.entity.TsProjectEntity;
import com.sut.strategy.entity.TsUserEntity;
import com.sut.strategy.service.ProjectMatchService;
import com.sut.strategy.service.TsProjectService;
import com.sut.strategy.util.JacksonUtil;
import com.sut.strategy.util.JsonReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/required")
public class RequiredController {
    @Autowired
    TsProjectService tsProjectService;
    @Autowired
    ProjectMatchService projectMatchService;
    @GetMapping("")
    public ModelAndView detail(@RequestParam String projId){
        ModelAndView modelAndView = new ModelAndView("required/required");
        TsProjectEntity pro = tsProjectService.findById(projId).get();
        JSONObject item = new JSONObject();
        try {
            item = JSON.parseObject(JacksonUtil.obj2json(pro));
            JSONObject jsonObject = JsonReader.excute("industry.json");
            item.put("industry", jsonObject.getJSONObject("industry").getString(pro.getIndustryId().substring(0,2)));
            item.put("industryName", jsonObject.getJSONObject("industryName").getString(pro.getIndustryId()));
            item.put("requireAttr", jsonObject.getJSONObject("requireAttr").getString(pro.getRequireAttrId()));
            item.put("industryAttr", jsonObject.getJSONObject("industryAttr").getString(pro.getDomainAttrId()));
            item.put("strategy", jsonObject.getJSONObject("strategy").getString(pro.getStrategyId()));
            item.put("location", jsonObject.getJSONObject("location").getString(pro.getLocationId()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        modelAndView.addObject("detail", item);
        return modelAndView;
    }

    @GetMapping("/claim")
    @ResponseBody
    public JSONObject claim(@RequestParam String projId, HttpSession httpSession) {
        projectMatchService.ProjectMatch(projId,String.valueOf(((TsUserEntity)httpSession.getAttribute("user")).getUserId()));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", 1);
        return jsonObject;
    }
    @GetMapping("/add")
    public String add() {
        return "required/add";
    }

}
