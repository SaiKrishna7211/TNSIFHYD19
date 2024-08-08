package com.day4;

public class String_Buffer {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer("Hello World");
		sb1.replace(1, 5,"surya");
		System.out.println(sb1);
		sb1.delete(0, 7);
		System.out.println(sb1);
		sb.reverse();
		System.out.println(sb);
	}
}
