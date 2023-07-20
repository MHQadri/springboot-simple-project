package com.spring.springbootsimpleproject.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

public class Employee {

	@Id
	private int employeeId;
	private String employeeName;
	private String employeeEmail;
	private long employeePhone;

}
