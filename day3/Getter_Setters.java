package com.day3;

public class Getter_Setters {
	private int speed;
	private String doors;
	private String engine;
	private String driver;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public void run() {
		if(speed>0&&doors.equals("closed")&&engine.equals("on")&&driver.equals("seated")) {
			System.out.println("Car is Running");
		}else {
			System.out.println("Car is not Running");
		}
	}

}
