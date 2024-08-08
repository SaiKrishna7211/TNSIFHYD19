package com.sriindu.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sriindu.shop.entity.Shop;
import com.sriindu.shop.service.ShopService;

@RestController
public class ShopController {
	@Autowired
	private ShopService ss;
	@PostMapping("/shop")
	public Shop saveShop(@RequestBody Shop shop) {
		return ss.saveShop(shop);
	}
	
	@GetMapping("/shop")
	public List<Shop> fetchShopList()
	{
		return ss.fetchShopList();
	}
	@GetMapping("/shop/{id}")
	 public Shop fetchShopById(@PathVariable("id") Long id)
    {
		return ss.fetchShopById(id);
    }
	 @DeleteMapping("/shop/{id}")
	    public String deleteShopById(@PathVariable("id") Long id) {
	        ss.deleteShopById(id);
	        return "Shop deleted Successfully!!";
	 }
	 @PutMapping("/shop/{id}")
	    public Shop updateShop(@PathVariable("id") Long id,
	                                       @RequestBody Shop shop) {
	        return ss.updateShop(id,shop);
	    }
}


