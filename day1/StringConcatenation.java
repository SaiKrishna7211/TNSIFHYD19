package com.day1;
import java.util.Scanner;
public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first string: ");
		String str1=sc.nextLine();
		System.out.print("Enter second string: ");
		String str2=sc.nextLine();
		String concatenatedStr=str1+str2;
		System.out.println("The concatenated String is: "+concatenatedStr);
		sc.close();
	}

}
