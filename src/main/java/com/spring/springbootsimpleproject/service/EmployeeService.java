package com.spring.springbootsimpleproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springbootsimpleproject.doa.EmployeeDao;
import com.spring.springbootsimpleproject.dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	/*
	 * save employee methods...
	 */
	public Employee saveEmployee(Employee employee) {

		return employeeDao.saveEmployee(employee);
	}

	/*
	 * save employee method....
	 */
	public List<Employee> saveMultipleEmployee(List<Employee> employee) {

		return employeeDao.saveMultipleEmployee(employee);
	}

	/*
	 * getEmployeeById method
	 */
	public Employee getEmployeeById(int employeeId) {

		return employeeDao.getEmployeeById(employeeId);
	}

	public List<Employee> getAll(Employee employee) {
		return employeeDao.getAll(employee);
	}

	public void deleteEmployeeByid(int empId) {
		employeeDao.deleteEmployeeByid(empId);
	}

	/*
	 * update Employee Method
	 */
	public Employee updateEmployee(Employee employee, int employeeId) {
		Employee employee2 = getEmployeeById(employeeId);

		if (employee2 != null) {
			
			employee2.setEmployeeName(employee.getEmployeeName());
			employee2.setEmployeeEmail(employee.getEmployeeEmail());
			employee2.setEmployeePhone(employee.getEmployeePhone());
			
			return employeeDao.updateEmployee(employee2);
		} else {
             return null;
		}
	}

}
