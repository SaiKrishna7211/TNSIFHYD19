package com.day3;

public class Multiple_InheritanceMain extends Multiple_Inheritance2 implements Multiple_Inheritance1{

	@Override
	public void parent_2() {
		// TODO Auto-generated method stub
		System.out.println("child can aquire properties from parent_2");
	}
	public static void main(String[] args) {
		Multiple_InheritanceMain obj = new Multiple_InheritanceMain();
		obj.parent_1();
		obj.parent_2();
	}

}
