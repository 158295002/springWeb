package com.evada.springweb.controller;

import com.evada.springweb.service.IStudentService;
import com.evada.springweb.springdata.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author dingqin
 * @date 2017/12/12
 */
@Controller
@RequestMapping("/student")
public class StudentController extends AbstractController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String showAllStudents(Model model){
        List<Student> students = studentService.findAll();
        model.addAttribute("students",students);
        return "/studentPage/allStudent";
    }

}
