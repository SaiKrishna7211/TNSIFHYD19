package com.sriindu.shop.service;

import java.util.List;

import com.sriindu.shop.entity.Shop;

public interface ShopService {

	Shop saveShop(Shop shop);

	List<Shop> fetchShopList();

	Shop fetchShopById(Long id);

	void deleteShopById(Long id);

	Shop updateShop(Long id, Shop shop);

}
