package com.sriindu6.demo.service;

import java.util.List;

import com.sriindu6.demo.entity.Item;

public interface ItemService {

	Item saveItem(Item item);

	List<Item> fetchItemList();

	Item fetchItemById(Long id);

	void deleteCustomerById(Long id);


	

}
