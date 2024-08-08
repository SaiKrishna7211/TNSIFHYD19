package com.sriindu4.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sriindu4.demo.entity.Customer;
import com.sriindu4.demo.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;







@RestController
public class CostomerController {

	
	@Autowired
	private CustomerService cs;
	
	@PostMapping("customers")
	public Customer saveCustomer(@RequestBody Customer customer) {
		//TODO: process POST request
		
		return cs.saveCustomer(customer);
	}
	
	@GetMapping("customers")
	public List<Customer> fetchCustomerList() {
		return cs.fetchCustomerList();
	}
	
	@GetMapping("customers/{id}")
	public Customer fetchCustomerById(@PathVariable("id") Long id ) {
		return cs.fetchCustomerById(id);
	}
	
	@DeleteMapping("customers/{id}")
	public String deleteCustomerById(@PathVariable("id") Long id) {
		cs.deleteCustomerById(id);
		return "Customer Deleted is Completed Successdully";
	}
	
	@PutMapping("customers/{id}")
	public Customer updateCustomerById(@PathVariable("id") Long id, @RequestBody Customer customer) {
		//TODO: process PUT request
		
		return cs.updateCustomerById(id,customer);
	}
	
}
