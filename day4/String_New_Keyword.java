package com.day4;

public class String_New_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";//creating string by Java string literal    
		char ch[]={'s','t','r','i','n','g','s'};    
		String s2=new String(ch);//converting char array to string    
		String s3=new String("example");//creating Java string by new keyword    
		System.out.println(s1);    
		System.out.println(s2);    
		System.out.println(s3);    
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
		System.out.println(s1+s3);
		System.out.println(s1.concat(s3));
	}

}
