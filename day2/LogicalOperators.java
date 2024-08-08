package com.day2;
import java.util.Scanner;
public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b&&a>c) {
			System.out.println("a is largest number");
		} else if(b>a||b>c) {
			System.out.println("b is larger than one or two numbers");
		}else {
			System.out.println("c is largest number");
		}
		sc.close();
	}

}
