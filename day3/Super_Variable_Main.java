package com.day3;

public class Super_Variable_Main extends Super_Variable{
	String car="Honda Car";
	void show() {
		System.out.println("car is :"+car);
		System.out.println("car is :"+super.car);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_Variable_Main b= new Super_Variable_Main();
		b.show();
	}

}
