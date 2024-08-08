package com.day2;

public class Main_StaticInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent_StaticInstsance obj=new Child_StaticInstance();
		System.out.println("a value = "+obj.a);
		System.out.println("b value = "+obj.b);
		obj.display();
		obj.show();
		
	}

}
