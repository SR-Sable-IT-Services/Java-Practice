package com.springproject.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import org.springframework.web.bind.annotation.RequestMapping;

import com.springproject.springdemo.entities.Student;
import com.springproject.springdemo.services.StudentService;

@Controller
@RequestMapping("/student")
public class MyController {
		@Autowired
	private StudentService stdServise;
				
	@GetMapping("/form")
    public String showForm(Model model) {     
        return "form";
    }
    @PostMapping("/submit")
    public String submitForm(@ModelAttribute Student student) {
        this.stdServise.saveStudent(student);
		return "redirect:/student/form";	
    }
    @GetMapping("/stdList")
    public String showStdList(Model model) {
    List<Student> students = stdServise.getAllStudentData();
    model.addAttribute("students", students);
        return "stdList";
    }
}
