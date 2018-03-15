package com.evada.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author dingqin
 * @date 2017/11/3
 */
@Controller
@RequestMapping("/")
public class HomeController extends AbstractController{

    @RequestMapping(value = "homePage",method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
