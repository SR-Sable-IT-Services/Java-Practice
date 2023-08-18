package com.springproject.springdemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springproject.springdemo.entities.Student;
import com.springproject.springdemo.repo.MyRepository;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	MyRepository myRepo;	

	@Override
	public void saveStudent(Student student) {
		myRepo.save(student);
		
	}

	 @Override
	    public List<Student> getAllStudentData() {
	        Iterable<Student> iterable = myRepo.findAll();
	        List<Student> studentList = new ArrayList<>();
	        
	        for (Student student : iterable) {
	            studentList.add(student);
	        }
	        
	        return studentList;
	    }
			
}
