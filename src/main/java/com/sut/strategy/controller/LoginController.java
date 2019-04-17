package com.sut.strategy.controller;

import com.alibaba.fastjson.JSONObject;
import com.sut.strategy.entity.TsUserEntity;
import com.sut.strategy.service.TsUserService;
import com.sut.strategy.util.MD5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Optional;

@Controller
public class LoginController {
    @Autowired
    TsUserService tsUserService;

    @RequestMapping("")
    public String login() {
        return "login";
    }

    @PostMapping("/loginCheck")
    @ResponseBody
    public JSONObject loginCheck(@RequestBody TsUserEntity tsUserEntity) throws UnsupportedEncodingException {
        JSONObject result = new JSONObject(new LinkedHashMap<>());
        Optional<TsUserEntity> res = tsUserService.findByUsername(tsUserEntity.getUserName());
        if (res.isPresent()) {
            if (res.get().getPassword().equalsIgnoreCase(MD5Service.Encrypt(tsUserEntity.getPassword()))) {
                result.put("stateCode", "2");
            } else
                result.put("stateCode", "1");
        } else result.put("stateCode", "0");
        return result;
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
