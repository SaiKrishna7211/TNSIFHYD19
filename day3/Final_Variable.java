package com.day3;

public class Final_Variable {
	final int speedlimit=120;
	void run() {
	    speedlimit=200;
		System.out.println("speed limit is : "+speedlimit);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_Variable fv=new Final_Variable();
		fv.run();
	}

}
