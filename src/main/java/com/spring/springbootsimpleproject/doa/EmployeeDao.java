package com.spring.springbootsimpleproject.doa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.springbootsimpleproject.dto.Employee;
import com.spring.springbootsimpleproject.repository.EmployeeRepository;

@Repository
public class EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;

	/*
	 * save employee methods...
	 */
	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	/*
	 * save employee method....
	 */
	public List<Employee> saveMultipleEmployee(List<Employee> employee) {

		return employeeRepository.saveAll(employee);
	}

	/*
	 * getEmployeeById method
	 */
	public Employee getEmployeeById(int employeeId) {

		Optional<Employee> optional = employeeRepository.findById(employeeId);

		if (optional.isPresent()) {

			return optional.get();
		} else {
			return null;
		}
	}
	/*
	 * getAllEmployee method
	 */
	
	public List<Employee> getAll(Employee employee)
	{
		return employeeRepository.findAll();
	}
	/*
	 * deleteEmployee method
	 */
	public void deleteEmployeeByid(int empId)
	{
		Employee employee=getEmployeeById(empId);
		employeeRepository.delete(employee);
	}
	/*
	 * update Employee Method
	 */
	public Employee updateEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}

}
