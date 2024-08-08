package com.day3;

public class InterfaceDemo2 implements Interface1,Interface2{

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("hdfs gives loans based on surity");
	}

	@Override
	public void goldloan() {
		// TODO Auto-generated method stub
		System.out.println("hdfs gives gold loans by taking surity as gold");
	}

	public void roi(double a) {
		// TODO Auto-generated method stub
		System.out.println("hdfs gives loans at "+a+" intrest");
	}

	public void intrest_on_glod(double b) {
		// TODO Auto-generated method stub
		System.out.println("hdfs gives loans at "+b+" intrest");
	}

}
