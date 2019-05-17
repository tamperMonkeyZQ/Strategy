package com.sut.strategy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/information")
public class InformationController {
    @GetMapping("")
    public ModelAndView inforMation(){
        ModelAndView modelAndView = new ModelAndView("information");
        return modelAndView;
    }
}
