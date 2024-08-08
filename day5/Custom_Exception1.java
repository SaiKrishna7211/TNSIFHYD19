package com.day5;
class MyException extends Exception{
	
}
public class Custom_Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException();
		} catch(MyException ex) {
			System.out.println("My Custom Exception Occured ");
			ex.printStackTrace();
		}
		System.out.println("rest of the code...... ");
	}

}
