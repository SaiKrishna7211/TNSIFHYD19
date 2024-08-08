package com.day4;

public class ExceptionNotOccured {
	
	public static void main(String[] args) {
		try {
			int data=10/0;
			System.out.println(data);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		finally {
			System.out.println("Finally Block is always executed");
		}
	}

}
