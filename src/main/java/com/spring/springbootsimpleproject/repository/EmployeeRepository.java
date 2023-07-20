package com.spring.springbootsimpleproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springbootsimpleproject.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
}
