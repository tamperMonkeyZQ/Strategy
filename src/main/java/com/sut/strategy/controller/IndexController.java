package com.sut.strategy.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sut.strategy.service.TeProjectService;
import com.sut.strategy.util.JacksonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @Autowired
    TeProjectService teProjectService;

    @PostMapping("/project/list")
    @ResponseBody
    public JSONArray projectList() {
        JSONArray jsonArray = new JSONArray();
        teProjectService.findAll().forEach((pro)->{
            JSONObject item = new JSONObject();
            try {
                item = JSON.parseObject(JacksonUtil.obj2json(pro));
            } catch (Exception e) {
                e.printStackTrace();
            }
            jsonArray.add(item);
        });
        return jsonArray;
    }
}
