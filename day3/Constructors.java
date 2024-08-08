package com.day3;

public class Constructors {
	private int speed;
	private String doors;
	private String engine;
	private String driver;
	
	public Constructors() {
		this.speed=82;
		this.doors="open";
		this.driver="seated";
		this.engine="on";
	}
	public void run() {
		System.out.println(speed);
		System.out.println(doors);
		System.out.println(engine);
		System.out.println(driver);
		
		if(speed>0&&doors.equals("close")&&engine.equals("on")&&driver.equals("seated")) {
			System.out.println("car is running");
		}else {
			System.out.println("car is not running");
		}
	}
}
