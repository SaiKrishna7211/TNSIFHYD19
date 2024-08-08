package com.day3;

public class Super_Method_Main extends Super_Method{
	public void eat() {
		System.out.println("dog is eating");
	}
	void work() {
		eat();
		super.eat();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_Method_Main obj=new Super_Method_Main();
		obj.work();
		
	}

}
