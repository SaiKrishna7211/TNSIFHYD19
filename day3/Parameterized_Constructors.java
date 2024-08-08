package com.day3;

public class Parameterized_Constructors {
	private int speed;
	private String doors;
	private String engine;
	private String driver;
	public Parameterized_Constructors(String doors, String engine, String driver, int speed) {
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
 
	public String run() {
		System.out.println(doors);
		System.out.println(engine);
		System.out.println(driver);
		System.out.println(speed);
		if(doors.equals("closed") && engine.equals("on")&& driver.equals("seated") 
				&& speed >0) {
			return "car is running";
		}else {
			return "car is not running";
		}
	}
}
