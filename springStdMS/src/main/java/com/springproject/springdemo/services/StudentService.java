package com.springproject.springdemo.services;

import java.util.List;

import com.springproject.springdemo.entities.Student;

public interface StudentService {

	void  saveStudent(Student student);

	List<Student> getAllStudentData();

}
