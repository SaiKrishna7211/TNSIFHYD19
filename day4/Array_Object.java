package com.day4;

public class Array_Object {
	int a1[]= {2,4,5,6,7};
	String a2[]= {"s1","s2"};
	int roll_no;
	String name;
	Array_Object(int roll_no,String name) {
		this.roll_no=roll_no;
		this.name=name;
	}
	public static void main(String[] args) {
		Array_Object[] arr;
		arr=new Array_Object[5];
		arr[0]=new Array_Object(1,"surya");
		arr[1]=new Array_Object(2,"raju");
		arr[2]=new Array_Object(3,"dayakar");
		arr[3]=new Array_Object(4,"shivaraj");
		arr[4]=new Array_Object(5,"tarun");
		for(int i=0;i<arr.length;i++) {
			System.out.println("element at "+i+" : "+arr[i].roll_no+" "+arr[i].name);
		}
	}
}
