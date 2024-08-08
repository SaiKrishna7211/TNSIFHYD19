package com.day5;

@FunctionalInterface
interface Drawable{
	void draw();
}

public class Java8_Lambda_Expression {
	public static void main(String[] args) {
		int width=10;
		Drawable d=  () ->{
			System.out.println("Drawing "+width);
		};
		d.draw();
	}
}
