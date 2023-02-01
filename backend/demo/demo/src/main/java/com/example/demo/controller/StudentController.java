package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Student;
import com.example.demo.service.StudentService;

@RestController
@CrossOrigin
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/studentDetails")
	public List<Student> GetDetails()
	{
		return service.getStudents();
	}
	

}
