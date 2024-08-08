package com.day3;

public class Multilvel_InheritanceMain extends Multilvel_Inheritance2{
	public String food() {
		return "I eat Biscuits";
	}
	
	public static void main(String[] args) {
		Multilvel_InheritanceMain obj=new Multilvel_InheritanceMain();
		System.out.println("I am an "+obj.name()+", I belongs to "+obj.category()+" category and "+obj.food());
	}
}
