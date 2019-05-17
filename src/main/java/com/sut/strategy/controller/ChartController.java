package com.sut.strategy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/charts")
public class ChartController {
    @GetMapping("")
    public String chats(){
        return "charts/charts";
    }
}
