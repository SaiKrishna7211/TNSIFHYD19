package com.day4;

public class Multiple_Catch_Block_2 {
	
	public static void main(String[] args) {
        try {
			int a[] = new int[5];
			System.out.println(a[10]);
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
