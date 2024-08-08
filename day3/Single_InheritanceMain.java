package com.day3;

public class Single_InheritanceMain extends Single_Inheritance {
	void show() {
		System.out.println("this is single inheritance from child class");
	}
	
	public static void main(String[] args) {
		Single_InheritanceMain obj = new Single_InheritanceMain();
		obj.display();
		obj.show();
	}
}
