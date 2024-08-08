package com.day4;

public class Throw_Example2 {
	
	void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("not valid");
		}
		else
			System.out.println("welcome to vote");
	}
	
	public static void main(String[] args) {
		Throw_Example2 t1 = new Throw_Example2();
		t1.validate(14);
	}

}
