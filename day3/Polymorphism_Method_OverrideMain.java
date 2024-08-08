package com.day3;

public class Polymorphism_Method_OverrideMain {
	public static void main(String[] args) {
		Polymorphism_Method_Override2 obj1 = new Polymorphism_Method_Override2();
		System.out.println(obj1.add(5, 67));
		System.out.println("*******************************************************");
		Polymorphism_Method_Override1 obj2 = new Polymorphism_Method_Override1();
		System.out.println(obj2.add(97, 42));
	}
}
