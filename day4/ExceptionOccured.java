package com.day4;

public class ExceptionOccured {

	public static void main(String[] args) {
		try {
			int data = 50 / 0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			// TOrthDO: handle exception
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block is always executed");
		}

	}

}
