package com.sut.strategy.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.querydsl.core.Tuple;
import com.sut.strategy.entity.TeProjectEntity;
import com.sut.strategy.entity.TsProjectEntity;
import com.sut.strategy.entity.TsUserEntity;
import com.sut.strategy.service.ProjectMatchService;
import com.sut.strategy.service.TsProjectService;
import com.sut.strategy.util.JacksonUtil;
import com.sut.strategy.util.JsonReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/project")
@Slf4j
public class ProjectController {
    @Autowired
    ProjectMatchService projectMatchService;
    @Autowired
    TsProjectService tsProjectService;

    @GetMapping("/list")
    @ResponseBody
    public JSONObject getList(@RequestParam String searchText,
                              @RequestParam String domainId,
                              @RequestParam String industyId,
                              @RequestParam String domainAttr,
                              @RequestParam String requireAttr,
                              @RequestParam String location,
                              @RequestParam String strategy,
                              @RequestParam(value = "pageNumber") int pageNumber,@RequestParam(value = "pageSize") int pageSize){
        JSONArray jsonArray = new JSONArray();
        Page<TsProjectEntity> list= tsProjectService.findAll(searchText,domainId,industyId,domainAttr,requireAttr,location,strategy,pageNumber,pageSize);
        list.forEach((pro)->{
            JSONObject item = new JSONObject();
            try {
                item = JSON.parseObject(JacksonUtil.obj2json(pro));
                JSONObject jsonObject = JsonReader.excute("industry.json");
                item.put("industry", jsonObject.getJSONObject("industry").getString(pro.getIndustryId().substring(0,2)));
                item.put("industryName", jsonObject.getJSONObject("industryName").getString(pro.getIndustryId()));
                item.put("requireAttr", jsonObject.getJSONObject("requireAttr").getString(pro.getRequireAttrId()));
                item.put("industryAttr", jsonObject.getJSONObject("industryAttr").getString(pro.getDomainAttrId()));
                item.put("location", jsonObject.getJSONObject("location").getString(pro.getLocationId()));
            } catch (Exception e) {
                e.printStackTrace();
            }
            jsonArray.add(item);
        });
        JSONObject result = new JSONObject();
        result.put("rows", jsonArray);
        result.put("total", list.getTotalElements());
        return result;
    }
    @GetMapping("/matchList")
    public ModelAndView getMatchList(HttpSession httpSession){
        ModelAndView modelAndView = new ModelAndView("project/list");
        TsUserEntity currentUser = (TsUserEntity) httpSession.getAttribute("user");
        if (currentUser.getGroupId().equals("2")) {
            modelAndView.setViewName("school-user/school-project");
        }
        if (currentUser.getGroupId().equals("3")) {
            modelAndView.setViewName("entertainment-user/project");
        }
        modelAndView.addObject("list",projectMatchService.findProjectMatchList(String.valueOf(currentUser.getUserId())));
        log.info(modelAndView.toString());
        return modelAndView;
    }

    @GetMapping("/detail")
    public ModelAndView getProjectDetail(@RequestParam String id) {
        ModelAndView modelAndView = new ModelAndView("project/detail");
        modelAndView.addObject("detail", projectMatchService.geiProjectDetail(id));
        return modelAndView;
    }
    @DeleteMapping("")
    @ResponseBody
    public JSONObject delete(@RequestParam String id){
        JSONObject jsonObject = new JSONObject();
        if(tsProjectService.deleteByid(id)){
            jsonObject.put("status", "success");
        }
        else
            jsonObject.put("status", "error");
        return jsonObject;
    }

    @PatchMapping("/reset")
    @ResponseBody
    public JSONObject reset(@RequestParam String zxh) {
        JSONObject result = new JSONObject();
        if(tsProjectService.resetByid(zxh)){
            result.put("states", 1);
        }
        else
            result.put("states", 2);
        return result;
    }
}
