package com.sut.strategy.controller;

import com.alibaba.fastjson.JSONObject;
import com.sut.strategy.entity.TsUserEntity;
import com.sut.strategy.service.TsUserService;
import com.sut.strategy.util.MD5Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Optional;

@Controller
@Slf4j
public class LoginController {
    @RequestMapping("")
    public String login() {
        return "login";
    }

    @RequestMapping("/admin/index")
    public String index(HttpSession httpSession) {
        return "index";
    }
    @RequestMapping("/school-user/index")
    public String schoolIndex() {
        return "school-user/school-index";
    }
    @RequestMapping("/entertainment-user/index")
    public String entertainmentIndex() {
        return "entertainment-user/index";
    }
}