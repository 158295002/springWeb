package com.evada.springweb.springdata.model;

import javax.persistence.*;
import java.util.List;

/**
 * @author dingqin
 * @date 2017/12/11
 */
@Table(name = "student")
@Entity
public class Student {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    @Column(name = "name")
    private String name;

//    private List<Course> courseList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Course> getCourseList() {
//        return courseList;
//    }
//
//    public void setCourseList(List<Course> courseList) {
//        this.courseList = courseList;
//    }
}
