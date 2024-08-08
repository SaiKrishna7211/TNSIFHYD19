package com.sriindu5.demo.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriindu5.demo.entity.Employee;
import com.sriindu5.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository er;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return er.save(employee);
	}

	@Override
	public List<Employee> fetchEmployeeList() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public Employee fetchEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return er.findById(id).get();
	}

	@Override
	public void deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		er.deleteById(id);
	}

	@Override
	public Employee pdateEmployeeById(Long id, Employee employee) {
		// TODO Auto-generated method stub
		
		Employee emp = er.findById(id).get();
		
		if(Objects.nonNull(employee.getName()) && !"".equalsIgnoreCase(employee.getName())) {
			emp.setName(employee.getName());
		}
		
		if(Objects.nonNull(employee.getDob()) && !LocalDate.MIN.equals(employee.getDob())) {
			emp.setDob(employee.getDob());
		}
		
		return er.save(emp);
	}
	
	
	
	
	
}
