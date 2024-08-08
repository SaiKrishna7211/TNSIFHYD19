package com.day4;

public class String_Literal {
	public static void main(String[] args) {
		String s1="Sachin";
		String s2="Sachin";
		String s3=" Tendulkar";
		String s4="Dhoni";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s4));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1+s3);
		System.out.println(s1.concat(s3));
	}
}
