package com.evada.springweb.springdata.repository;

import com.evada.springweb.springdata.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author dingqin
 * @date 2017/12/12
 */
@Repository
@Transactional
public class StudentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Student student){
        entityManager.persist(student);
    }

    public Student findOne(int id){
        entityManager.getTransaction().begin();
        return entityManager.find(Student.class,id);
    }
}
