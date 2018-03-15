package com.evada.springweb.repository;

import com.evada.springweb.jdbc.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dingqin
 * @date 2017/11/6
 */
@Component//暂时没跟数据库交互，先注释成Component
public class PersonRepository {

    public List<Person> findAllStudents(){
        List<Person> students = new ArrayList<Person>();
        Person student1 = createStudent("001","A学生",2);
        Person student2 = createStudent("002","B学生",1);
        Person student3 = createStudent("003","C同学",3);
        Person student4 = createStudent("004","D同学",5);
        Person student5 = createStudent("005","E同学",9);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        return students;
    }

    private Person createStudent(String id, String name, int num) {
        Person student = new Person();
        student.setId(id);
        student.setName(name);
        student.setCourses(getCourse(num));
        return student;
    }

    private List<String> getCourse(int index) {
        List<String> courses = new ArrayList<String>();
        for(int i = 0;i<=index;i++){
            courses.add("课程"+i);
        }
        return courses;
    }

}
