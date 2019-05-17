package com.sut.strategy.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sut.strategy.entity.TeProjectEntity;
import com.sut.strategy.entity.TsUserEntity;
import com.sut.strategy.service.DDomainIndustryEntityService;
import com.sut.strategy.service.DLocationEntityService;
import com.sut.strategy.service.TeProjectService;
import com.sut.strategy.service.TsUserService;
import com.sut.strategy.util.JacksonUtil;
import com.sut.strategy.util.MD5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Optional;

@RestController
public class IndexController {
    @Autowired
    TeProjectService teProjectService;
    @Autowired
    TsUserService tsUserService;
    @Autowired
    DDomainIndustryEntityService dDomainIndustryEntityService;
    @Autowired
    DLocationEntityService dLocationEntityService;

    @PostMapping("/loginCheck")
    public JSONObject loginCheck(@RequestBody TsUserEntity tsUserEntity, HttpSession httpSession) throws UnsupportedEncodingException {
        JSONObject result = new JSONObject(new LinkedHashMap<>());
        Optional<TsUserEntity> res = tsUserService.findByUsername(tsUserEntity.getUserName());
        if (res.isPresent()) {
            if (res.get().getPassword().equalsIgnoreCase(MD5Service.Encrypt(tsUserEntity.getPassword()))) {
                switch (res.get().getGroupId()) {
                    case "1":result.put("stateCode", "2");httpSession.setAttribute("user",res.get());break;
                    case "2":result.put("stateCode", "3");httpSession.setAttribute("user",res.get());break;
                    case "3":result.put("stateCode", "4");httpSession.setAttribute("user",res.get());break;
                }
            } else
                result.put("stateCode", "1");
        } else result.put("stateCode", "0");
        return result;
    }

    @GetMapping("/loadIndusty")
    public JSONArray getIndusty(@RequestParam String domainCode){
        JSONArray result = new JSONArray();
        dDomainIndustryEntityService.findByDomainId(domainCode).forEach(dDomainIndustryEntity -> {
            JSONObject temp = new JSONObject();
            temp.put("industyId",dDomainIndustryEntity.getIndustryId());
            temp.put("industyName",dDomainIndustryEntity.getIndustryName());
            result.add(temp);
        });
        return result;
    }

    @GetMapping("loadLocation")
    public JSONArray getLocation() {
        JSONArray result = new JSONArray();
        dLocationEntityService.findAll().forEach(dLocationEntity -> {
            JSONObject temp = new JSONObject();
            temp.put("code",dLocationEntity.getCode());
            temp.put("area",dLocationEntity.getArea());
            result.add(temp);
        });
        return result;
    }
}