package com.evada.springweb.serviceImp;

import com.evada.springweb.jdbc.model.Person;
import com.evada.springweb.repository.PersonJdbcRespository;
import com.evada.springweb.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dingqin
 * @date 2017/11/6
 */
@Service
public class PersonServiceImp implements IPersonService {

    @Autowired
    private PersonJdbcRespository studentRepository;

    @Override
    public List<Person> findAllPersons() {
        return studentRepository.findAllStudents();
    }

    @Override
    public void insertStudent(Person student) {
        studentRepository.insertStudent(student);
    }
}
