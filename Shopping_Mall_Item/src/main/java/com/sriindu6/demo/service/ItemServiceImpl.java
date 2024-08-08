package com.sriindu6.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sriindu6.demo.entity.Item;
import com.sriindu6.demo.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	private ItemRepository ir;

	@Override
	public Item saveItem(Item item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> fetchItemList() {
		// TODO Auto-generated method stub
		return ir.findAll();
	}

	@Override
	public Item fetchItemById(Long id) {
		// TODO Auto-generated method stub
		return ir.findById(id).get();
	}

	@Override
	public void deleteCustomerById(Long id) {
		// TODO Auto-generated method stub
		ir.deleteById(id);
	}

	
	
	
}
