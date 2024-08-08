package com.day3;

public class Polymorphism_Method_Overload {
	public void show() {
		System.out.println("I am a JAVA Full Stack Developer");
	}
	public void show(String name) {
		System.out.println(name+" is a JAVA Full Stack Developer");
	}
	public static void main(String[] args) {
		Polymorphism_Method_Overload obj = new Polymorphism_Method_Overload();
		obj.show();
		System.out.println("************************************************");
		obj.show("Nani");
	}
}
