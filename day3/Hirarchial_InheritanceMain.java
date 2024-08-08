package com.day3;

public class Hirarchial_InheritanceMain extends Hirarchial_Inheritance1{
	public void work() {
		System.out.println("I can manage both Frontend & Backend ");
	}
	public static void main(String[] args) {
		Hirarchial_Inheritance2 obj1=new Hirarchial_Inheritance2();
		Hirarchial_InheritanceMain obj2=new Hirarchial_InheritanceMain();
		obj1.person();
		obj1.domain();
		System.out.println("**************************************");
		obj2.person();
		obj2.work();
	}
}
