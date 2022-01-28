package com.wonderlabz.converter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class AngularJSWebController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String homePage(){
        return "index";
    }
}
