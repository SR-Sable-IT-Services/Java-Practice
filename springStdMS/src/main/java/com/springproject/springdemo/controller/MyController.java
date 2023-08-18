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
import org.springframework.web.bind.annotation.RequestParam;

import com.springproject.springdemo.entities.Student;
import com.springproject.springdemo.services.StudentService;

@Controller
@RequestMapping("/student")
public class MyController {
		@Autowired
	private StudentService stdService;
				
	@GetMapping("/form")
    public String showForm(Model stdServise) {     
        return "form";
    }
    @PostMapping("/submit")
    public String submitForm(@ModelAttribute Student student) {
        this.stdService.saveStudent(student);
		return "redirect:/student/form";	
    }
    @GetMapping("/stdList")
    public String showStdList(Model model) {
    List<Student> students = stdService.getAllStudentData();
    model.addAttribute("students", students);
        return "stdList";
    }
    @GetMapping("/view")
    public String viewStudent(@RequestParam("id") long stdId ,Model model) {   	
    	Student studentD=stdService.getStudentById(stdId);
    	if(studentD != null) {
    		model.addAttribute("student", studentD);
    		return "view";
    	}else { return "student-not-found";}      	
    }   
    @GetMapping("/delete")
    public String deleteStd(@RequestParam("id") long stdId ) {   	
    	stdService.deleteStudent(stdId);
		return "redirect:/student/stdList";   	       	
    }  
    @GetMapping("/update")
    public String editStudent(@RequestParam("id") long stdId, Model model) {
        Student student = stdService.getStudentById(stdId);
        model.addAttribute("student", student);
        return "editStudent"; 
    }
    @PostMapping("/update")
    public String updateStudent(@ModelAttribute Student updatedStd) {
        stdService.updateStudent(updatedStd);
        return "redirect:/student/stdList"; 
    }
}
