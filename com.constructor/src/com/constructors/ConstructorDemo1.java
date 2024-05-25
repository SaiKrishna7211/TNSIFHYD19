package com.constructors;

public class ConstructorDemo1 {
	private String phone ;
	private String battery;
	private int ram;
	private int price;
	
	public void CunstroctorDemo1() {
		
		phone = "Realme";
		battery = "6000 MAH";
		ram = 12;
		price = 25000;
		
	}

	public String getPhone() {
		return phone;
	}

	public String getBattery() {
		return battery;
	}

	public int getRam() {
		return ram;
	}

	public int getPrice() {
		return price;
	}
	

}

