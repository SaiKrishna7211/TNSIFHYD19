package com.sriindu4.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriindu4.demo.entity.Customer;
import com.sriindu4.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository cr;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return cr.save(customer);
	}

	@Override
	public List<Customer> fetchCustomerList() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public Customer fetchCustomerById(Long id) {
		// TODO Auto-generated method stub
		return cr.findById(id).get();
	}

	@Override
	public void deleteCustomerById(Long id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
	}

	@Override
	public Customer updateCustomerById(Long id, Customer customer) {
		// TODO Auto-generated method stub
		
		Customer c=cr.findById(id).get();
		
		if(Objects.nonNull(customer.getName()) && !"".equalsIgnoreCase(customer.getName())) {
			c.setName(customer.getName());
		}
		
		if(Objects.nonNull(customer.getPhone()) && customer.getPhone() !=0) {
			c.setPhone(customer.getPhone());
		}
		
		if(Objects.nonNull(customer.getEmail()) && !"".equalsIgnoreCase(customer.getEmail())) {
			c.setEmail(customer.getEmail());
		}
		
		return cr.save(c);
	}

}
