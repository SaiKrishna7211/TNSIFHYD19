package com.sriindu6.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.sriindu6.demo.entity.Item;
import com.sriindu6.demo.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService is;
	
	@PostMapping("/items")
	public Item saveItem(@RequestBody Item item) {
		//TODO: process POST request
		
		return is.saveItem(item);
	}
	
	@GetMapping("items")
	public List<Item> fetchCustomerList() {
		return is.fetchItemList();
	}
	
	@GetMapping("items/{id}")
	public Item fetchCustomerById(@PathVariable("id") Long id ) {
		return is.fetchItemById(id);
	}
	
	@DeleteMapping("items/{id}")
	public String deleteCustomerById(@PathVariable("id") Long id) {
		is.deleteCustomerById(id);
		return "Customer Deleted is Completed Successdully";
	}
	
}
