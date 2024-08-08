package com.day2;

public class Child_StaticInstance extends Parent_StaticInstsance{
	int a=30;
	static int b=40;
	public void display() {
		System.out.println("this is instance method from child");
	}
	public static void show() {
		System.out.println("this is static method from child");
	}

}
