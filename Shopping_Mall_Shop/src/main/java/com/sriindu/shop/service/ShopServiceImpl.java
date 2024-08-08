package com.sriindu.shop.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sriindu.shop.entity.Shop;
import com.sriindu.shop.repository.ShopRepository;

@Service
public class ShopServiceImpl implements ShopService{
	@Autowired
	private ShopRepository sr;

	@Override
	public Shop saveShop(Shop shop) {
		// TODO Auto-generated method stub
		return sr.save(shop);
	}

	@Override
	public List<Shop> fetchShopList() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public Shop fetchShopById(Long id) {
		// TODO Auto-generated method stub
		return sr.findById(id).get();
	}

	@Override
	public void deleteShopById(Long id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
		
	}

	@Override
	public Shop updateShop(Long id, Shop shop) {
		Shop shopDB = sr.findById(id).get();

	       if(Objects.nonNull(shop.getShopName()) &&
	       !"".equalsIgnoreCase(shop.getShopName())) {
	           shopDB.setShopName(shop.getShopName());;
	       }
	       return sr.save(shopDB);
	   }
	

}
