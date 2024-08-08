package com.day3;

public class Super_Class_Main extends Super_Class{
	void sleep() {
		System.out.println("dog is sleeping");
		super.sleep();
	}
	public static void main(String[] args) {
		Super_Class_Main obj= new Super_Class_Main();
		obj.sleep();
	}

}
