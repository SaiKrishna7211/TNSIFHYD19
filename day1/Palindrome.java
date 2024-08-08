package com.day1;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr a String:");
		String str=sc.nextLine();
		String reversedStr="";
		for(int i=str.length()-1;i>=0;i--) {
			reversedStr+=str.charAt(i);
		}
		if(str.equals(reversedStr)) {
			System.out.println(str+" is a palindrome");
		}else {
			System.out.println(str+" is not a palindrome");
		}
		sc.close();
	}

}
