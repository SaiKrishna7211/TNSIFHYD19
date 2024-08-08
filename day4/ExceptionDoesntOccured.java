package com.day4;

public class ExceptionDoesntOccured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int data = 25 / 5;
			System.out.println(data);
		} catch (NullPointerException e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block is always executed");
		}

	}

}
