package com.day4;

public class Multiple_Catch_Block_3 {
	
	public static void main(String[] args) {
        try {
			String s= null;
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			
			System.out.println("ArithmeticException Occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndex out of bound exception occurs");
		}   
        
        catch (Exception e) {
			System.out.println("parent exception Occurs");
		}
        System.out.println("rest of the code");

	}

}
