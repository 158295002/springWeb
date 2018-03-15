package com.evada.springweb.controller;

import com.evada.springweb.jdbc.model.Person;
import com.evada.springweb.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dingqin
 * @date 2017/11/6
 */
@Controller
@RequestMapping("/")
public class PersonController extends AbstractController{

    @Autowired
    private IPersonService personService;

    @RequestMapping(value = "findAllPersons",method = RequestMethod.GET)
    public String findAllPersons(Model model){
       List<Person> persons = personService.findAllPersons();
       model.addAttribute("persons",persons);
       return "allPerson";
    }

    @RequestMapping(value = "addPerson", method = RequestMethod.GET)
    public String addStudent(){
        return "addPerson";
    }

    @Autowired
    private HttpServletRequest request;

    /**
     * errors要紧跟在要校验的对象后面
     * @param student
     * @param errors
     * @param remodel
     * @param model
     * @return
     */
    @RequestMapping(value = "addPerson",method = RequestMethod.POST)
    public String saveStudent(@Valid Person student, BindingResult errors,
                              RedirectAttributes remodel, Model model,
                              @RequestPart("head_portrait")MultipartFile[] head_portrait)throws Exception{
        if (errors.hasErrors()) {
            processErrors(errors, model);
            return "addPerson";
        }
        //获取工程的绝对路径
        String path = request.getServletContext().getRealPath("");
        try {
            for(MultipartFile file:head_portrait){
                file.transferTo(new File(path+"\\icons\\"+file.getOriginalFilename()));
            }
        } catch (IOException e) {
           String message = "上传的路径有误,请确认！";
//           throw new MyException(message);
        }
        List<String> iconNames = Arrays.asList(head_portrait).stream().map(MultipartFile::getOriginalFilename).collect(Collectors.toList());
        student.setIconNames(iconNames);
        //保存到数据库中
        personService.insertStudent(student);
        remodel.addFlashAttribute("student",student);
        return "redirect:showAllPerson";//重定向是访问URL不是返回对应的jsp页面
    }

    private void processErrors(BindingResult errors, Model model) {
        List<FieldError> errorMessage =  errors.getFieldErrors();
        StringBuilder sb = new StringBuilder();
        errorMessage.stream().forEach(message -> sb.append(message.getDefaultMessage()+";\n"));
        model.addAttribute("message",sb.toString());
    }

    @RequestMapping("showAllPerson")
    public String home(@ModelAttribute("student") Person student, Model model) {
        System.out.println("拿到重定向得到的参数student:" + student.getName());
        List<Person> persons = personService.findAllPersons();
//        persons.add(0,student);//已经添加到数据库了，则无需再添加了
        model.addAttribute("persons", persons);
        return "allPerson";
    }

}
