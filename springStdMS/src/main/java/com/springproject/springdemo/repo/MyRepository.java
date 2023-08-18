package com.springproject.springdemo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springproject.springdemo.entities.Student;
@Repository
public interface MyRepository extends CrudRepository<Student, Long> {
	
}
