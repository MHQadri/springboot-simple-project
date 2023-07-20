package com.spring.springbootsimpleproject.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springbootsimpleproject.dto.Employee;
import com.spring.springbootsimpleproject.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/data")
	public String getDate() {
		return "todays Date = " + LocalDate.now();

	}

	/*
	 * save employee methods...
	 */
	@PostMapping(value = "/saveEmp")
	public Employee saveEmployee(@RequestBody Employee employee) {

		return employeeService.saveEmployee(employee);
	}
	/*
	 * save employee method....
	 */
	@PostMapping(value = "/saveMultipleEmployee")
	public List<Employee> saveMultipleEmployee(@RequestBody List<Employee> employee) {
		
		return employeeService.saveMultipleEmployee(employee);
	}
		
	/*
	 * getEmployeeById method
	 */
	@GetMapping(value = "/getEmployee/{employeeId}")
	public Employee getEmployeeById(@PathVariable int employeeId) {
		
		return employeeService.getEmployeeById(employeeId);
	}
	
	@GetMapping(value = "/getAll")
	public List<Employee> getAll(Employee employee)
	{
		return employeeService.getAll(employee);
	}
	
	@DeleteMapping(value = "deleteById/{empId}")
	public void deleteEmployeeByid(@PathVariable int empId)
	{
		employeeService.deleteEmployeeByid(empId);
	}
	
	/*
	 * update Employee Method
	 */
	@PutMapping("updateEmployee/{employeeId}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable int employeeId)
	{
		return employeeService.updateEmployee(employee, employeeId);
	}

}
