package com.spring.springbootsimpleproject.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	private int studentId;
	private String studentName;
	private String studentEmail;
	private long studentPhone;
}
