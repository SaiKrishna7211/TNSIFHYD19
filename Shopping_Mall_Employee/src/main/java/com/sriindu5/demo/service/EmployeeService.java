package com.sriindu5.demo.service;

import java.util.List;

import com.sriindu5.demo.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> fetchEmployeeList();

	Employee fetchEmployeeById(Long id);

	void deleteEmployeeById(Long id);

	Employee pdateEmployeeById(Long id, Employee employee);

}
