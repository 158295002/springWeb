package com.evada.springweb.service;

import com.evada.springweb.jdbc.model.Person;

import java.util.List;

/**
 * @author dingqin
 * @date 2017/11/6
 */
public interface IPersonService {

    public List<Person> findAllPersons();

    public void insertStudent(Person student);
}
