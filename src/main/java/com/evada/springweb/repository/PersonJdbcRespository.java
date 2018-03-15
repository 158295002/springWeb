package com.evada.springweb.repository;

import com.evada.springweb.jdbc.model.Person;
import com.evada.springweb.jdbc.model.PersonRowMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dingqin
 * @date 2017/11/21
 */
@Repository
public class PersonJdbcRespository extends PersonRepository {

    @Autowired
    private JdbcOperations jdbcOperations;

    private String INSERT_SQL = "insert into person values(?,?,?)";

    private String SELECT_SQL = "select * from person where id = ?";

    private String SELECT_ALL_SQL = "select * from person";


    public void insertStudent(Person person){
        String iconNames = StringUtils.join(person.getIconNames(),",");
        jdbcOperations.update(INSERT_SQL,person.getId(),person.getName(),iconNames);
        Person student1 = findOne(person.getId());
        System.out.println(student1.toString());
    }

    public Person findOne(String id){
        return jdbcOperations.queryForObject(SELECT_SQL,new Object[]{id},new PersonRowMapper());
    }

    @Override
    public List<Person> findAllStudents() {
        return jdbcOperations.query(SELECT_ALL_SQL,new PersonRowMapper());
    }
}
