package com.day3;

public class AbstarctMain {
	public static void main(String[] args) {
		AbstractDemo1 c= new AbstractDemo2();
		c.vehicle("Audi");
		c.wheels();
		System.out.println("************************");
		AbstractDemo1 b= new AbstractDemo3();
		b.vehicle("Duke");
		b.wheels();
	}
}
