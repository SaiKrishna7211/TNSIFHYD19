package com.sriindu5.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sriindu5.demo.entity.Employee;
import com.sriindu5.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService  es;
	
	@PostMapping("employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		//TODO: process POST request
		
		return es.saveEmployee(employee);
	}
	
	@GetMapping("employees")
	public List<Employee> fetchEmployeeList() {
		return es.fetchEmployeeList();
	}
	
	@GetMapping("employees/{id}")
	public Employee fetchEmployeeByid(@PathVariable ("id") Long id) {
		return es.fetchEmployeeById(id);
	}
	
	@DeleteMapping("employees/{id}")
	public String deleteEmployeeById(@PathVariable("id") Long id) {
		es.deleteEmployeeById(id);
		return "Employee Deletion Completed Successfully!!";
	}
	
	@PutMapping("employees/{id}")
	public Employee updateEmployeeById(@PathVariable("id") Long id, @RequestBody Employee employee) {
		//TODO: process PUT request
		
		return es.pdateEmployeeById(id,employee);
	}
	
}
