package com.constructors;

public class ConstructorDemo2 {
	private String phone ;
	private String battery;
	private int ram;
	private int price;
	
	public ConstructorDemo2(String phone,String battery,int ram,int price) {
		this.phone=phone;
		this.battery=battery;
		this.ram=ram;
		this.price=price;
	}
	
	public String getPhone () {
		return phone;
	}
	public String getBattery() {
		return battery;
	}
	public int getRam() {
		return ram;
	}
	public int getprice() {
		return price;
	}
}
