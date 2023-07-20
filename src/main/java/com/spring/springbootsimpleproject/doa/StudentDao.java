package com.spring.springbootsimpleproject.doa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.springbootsimpleproject.dto.Student;
import com.spring.springbootsimpleproject.repository.StudentRepository;

@Repository
public class StudentDao {
	
	@Autowired
	private StudentRepository studentRepository;

	/*
	 * student saveMethod 
	 */
	public Student saveStudent(Student student) 
	{
		
		return studentRepository.save(student);		
		
	}
	
	
}
