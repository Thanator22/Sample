package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.beans.Student;

@Service
public class StudentService {
	
	List<Student> list;
	
	public StudentService()
	{
		list = new ArrayList<>();
		list.add(new Student("Mayank", 9837465,87));
	}
	
	public List<Student> getStudents(){
		return list;
	}

}
