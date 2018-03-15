package com.evada.springweb.springdata.repository;

import com.evada.springweb.springdata.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


/**
 * @author dingqin
 * @date 2017/12/12
 */
@Repository
@Transactional
public interface StudentSpringDataRepository extends JpaRepository<Student,Integer> {


}
