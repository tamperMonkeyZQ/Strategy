package com.sut.strategy.controller;

import com.sut.strategy.service.TsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    TsUserService tsUserService;
    @GetMapping("/list")
    public ModelAndView getContactList(@RequestParam int type) {
        ModelAndView modelAndView = new ModelAndView("contact/list");
        modelAndView.addObject("contactList", tsUserService.findAllByType(type, 1, 10));
        System.out.println("");
        return modelAndView;
    }
}
