package com.evada.springweb.jdbc.model;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * JSR-303校验
 * @author dingqin
 * @date 2017/11/6
 */
public class Person {

    @NotEmpty(message = "ID千万不能为空")
    @Size(min = 2,message = "长度只能最小为2")
    private String id;

    @NotEmpty(message = "名称确实不能为空")
    private String name;

    /** 头像*/
    private MultipartFile[] head_portrait;

    private List<String> courses;

    private List<String> iconNames;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultipartFile[] getHead_portrait() {
        return head_portrait;
    }

    public void setHead_portrait(MultipartFile[] head_portrait) {
        this.head_portrait = head_portrait;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public List<String> getIconNames() {
        return iconNames;
    }

    public void setIconNames(List<String> iconNames) {
        this.iconNames = iconNames;
    }

    @Override
    public String toString() {
        return "id:"+id+"   name:"+name;
    }
}
