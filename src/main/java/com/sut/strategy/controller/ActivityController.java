package com.sut.strategy.controller;

import com.alibaba.fastjson.JSONArray;
import com.sut.strategy.entity.TsActivityRecord;
import com.sut.strategy.service.TsActivityRecordService;
import com.sut.strategy.util.JacksonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    TsActivityRecordService tsActivityRecordService;
    @RequestMapping("/add")
    public String add(){
        return "activity/add";
    }

    @RequestMapping("list")
    @ResponseBody
    public List<TsActivityRecord> list(@RequestParam int projId) {
        return tsActivityRecordService.findAll(projId);
    }
}
