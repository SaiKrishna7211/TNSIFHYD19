package com.sriindu.shop.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shop {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long shopId;
	private String shopName;
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shop(long shopId, String shopName) {
		super();
		this.shopId = shopId;
		this.shopName = shopName;
	}
	public long getShopId() {
		return shopId;
	}
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	@Override
	public String toString() {
		return "Shop [shopId=" + shopId + ", shopName=" + shopName + "]";
	}

}
