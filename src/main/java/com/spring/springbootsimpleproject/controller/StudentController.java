package com.spring.springbootsimpleproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springbootsimpleproject.dto.Student;
import com.spring.springbootsimpleproject.response.ResponseStructure;
import com.spring.springbootsimpleproject.service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController 
{
	@Autowired
    private StudentService service;
	
	/*
	 * student saveMethod 
	 */
	@PostMapping(value = "/StudentSave")
	public ResponseStructure<Student> saveStudent(Student student) 
	{
		return service.saveStudent(student);
	}
}
