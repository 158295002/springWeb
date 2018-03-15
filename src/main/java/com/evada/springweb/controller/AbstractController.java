package com.evada.springweb.controller;

import com.evada.springweb.exception.MyException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author dingqin
 * @date 2017/11/14
 */
@ControllerAdvice
public class AbstractController {

    @ExceptionHandler(MyException.class)
    public ModelAndView processExcetion(MyException e){
        ModelAndView modelAndView = new ModelAndView("exception");
        modelAndView.addObject("message",e.getMessage());
        return modelAndView;
    }

}
