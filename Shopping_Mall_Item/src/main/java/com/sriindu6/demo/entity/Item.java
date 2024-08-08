package com.sriindu6.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Item {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private long id;
	private String itemName;
	private Long price;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(long id, String itemName, long price) {

		this.id = id;
		this.itemName = itemName;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", price=" + price + "]";
	}
	
	
	
}
