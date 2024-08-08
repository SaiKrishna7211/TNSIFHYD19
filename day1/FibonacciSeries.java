package com.day1;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int count=sc.nextInt();
		int num1=0,num2=1;
		System.out.println("Fibonacci series of "+count+" number:");
		for(int i=1;i<=count;i++) {
			System.out.println(num1+"");
			int sum=num1+num2;
			num1=num2;
			num2=sum;
		}
		sc.close();
	}

}
