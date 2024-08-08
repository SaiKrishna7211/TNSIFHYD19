package com.day1;
import java.util.Scanner;
public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number:");
		int num1=sc.nextInt();
		System.out.print("enter second number:");
		int num2=sc.nextInt();
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("after swapping");
		System.out.println("first number: "+num1);
		System.out.println("second number: "+num2);
		sc.close();
	}

}
