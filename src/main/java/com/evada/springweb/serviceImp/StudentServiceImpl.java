package com.evada.springweb.serviceImp;

import com.evada.springweb.service.IStudentService;
import com.evada.springweb.springdata.model.Student;
import com.evada.springweb.springdata.repository.StudentSpringDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dingqin
 * @date 2017/12/12
 */
@Service("studentService")
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentSpringDataRepository studentRepository;

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        Iterable<Student> stus =  studentRepository.findAll();
        for (Student student : stus){
            students.add(student);
        }
        return students;
    }
}
