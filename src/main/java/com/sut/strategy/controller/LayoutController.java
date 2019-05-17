package com.sut.strategy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LayoutController {
    @GetMapping("/personInfo")
    public ModelAndView getPersonInfo(@RequestParam String userId){
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }
}
