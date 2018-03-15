package com.evada.springweb.service;

import com.evada.springweb.springdata.model.Student;

import java.util.List;

/**
 * @author dingqin
 * @date 2017/12/12
 */
public interface IStudentService {

    public void save(Student student);

    public List<Student> findAll();
}
