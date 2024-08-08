package com.sriindu4.demo.service;

import java.util.List;

import com.sriindu4.demo.entity.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer customer);

	List<Customer> fetchCustomerList();

	Customer fetchCustomerById(Long id);

	void deleteCustomerById(Long id);

	Customer updateCustomerById(Long id, Customer customer);

}
