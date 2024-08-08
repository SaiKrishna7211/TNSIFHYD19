package com.day4;

public class Wrapper_AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a = 5786;
	    double b = 13.65;
	    long c=134;
	    String d="surya";

	    //converts into wrapper objects
	    Integer aObj = Integer.valueOf(a);
	    Double bObj = Double.valueOf(b);
	    Long cObj=Long.valueOf(c);
	    String dObj=String.valueOf(d);

	    if(aObj instanceof Integer) {
	      System.out.println("An object of Integer is created.");
	    }

	    if(bObj instanceof Double) {
	      System.out.println("An object of Double is created.");
	    }
	    if(cObj instanceof Long) {
	    	System.out.println("An object of Long is Created.");
	    }
	    if(dObj instanceof String) {
	    	System.out.println("An object of String is Created.");
	    }
	}

}
