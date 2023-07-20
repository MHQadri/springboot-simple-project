package com.spring.springbootsimpleproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.spring.springbootsimpleproject.doa.StudentDao;
import com.spring.springbootsimpleproject.dto.Student;
import com.spring.springbootsimpleproject.response.ResponseStructure;

@Service
public class StudentService 
{
	
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private ResponseStructure<Student> responseStructure;
	/*
	 * student saveMethod 
	 */
	public ResponseStructure<Student> saveStudent(Student student) 
	{
		Student student2=studentDao.saveStudent(student);
		
		if(student2!=null)
		{
			responseStructure.setStatusCode(HttpStatus.CREATED.value());
			responseStructure.setStatusMessage("Registered successfully");
			responseStructure.setStatusDescription("jjashdjhadjhjhdkjhdjkshdkahj");
			responseStructure.setStatusData(student2);
		}
		else {
			responseStructure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
			responseStructure.setStatusMessage("Registered unsuccessfully");
			responseStructure.setStatusDescription("jjashdjhadjhjhdkjhdjkshdkahj");
			responseStructure.setStatusData(student2);
		}
		
		return responseStructure;
	}
}
