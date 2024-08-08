package com.day4;

public class Wrapper_UnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer aObj=Integer.valueOf(3545);
		Double bObj=Double.valueOf(76.32);
		Long cObj=Long.valueOf(34);
		String dObj=String.valueOf("surya");
		
		int a= aObj.intValue();
		double b= bObj.doubleValue();
		long c= cObj.longValue();
		String d=dObj.toString();
		System.out.println("the value of a = "+a);
		System.out.println("the value of b = "+b);
		System.out.println("the value of c = "+c);
		System.out.println("the value of d = "+d);
	}

}
