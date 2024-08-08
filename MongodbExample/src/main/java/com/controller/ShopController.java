package com.controller;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.entity.Shop;
import com.repository.ShopRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class ShopController {
	@Autowired
	private ShopRepository sr;
	
	@PostMapping("/shops")
	public Shop saveShop(@RequestBody Shop shop) {
		//TODO: process POST request
		
		return sr.save(shop);
	}
	
	@GetMapping("/shops")
	public List<Shop> fetchShopsList() {
		return sr.findAll();
	}
	
	@GetMapping("/shops/{id}")
	public Shop fetchShopById(@PathVariable("id") Long id) {
		return sr.findById(id).get();
	}
	
	@DeleteMapping("/shops/{id}")
	public String deleteShop(@PathVariable("id") Long id) {
		sr.deleteById(id);
		return "Shop Deleted...!";
	}
	
	@PutMapping("shops/{id}")
	public Shop updateShop(@PathVariable("id") Long id, @RequestBody Shop shop) {
		//TODO: process PUT request
		
		Shop s=sr.findById(id).get();
		
		if(Objects.nonNull(shop.getShopName())&&!"".equalsIgnoreCase(shop.getShopName())) {
			s.setShopName(shop.getShopName());
		}
		
		return sr.save(s);
	}
	
}
