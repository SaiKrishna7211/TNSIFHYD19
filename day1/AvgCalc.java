package com.day1;
import java.util.Scanner;
public class AvgCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number:");
		int num1=sc.nextInt();
		System.out.print("enter second number:");
		int num2=sc.nextInt();
		int avg=(num1+num2)/2;
		System.out.println("the avg of "+num1+" and "+num2+" is: "+avg);
		sc.close();
	}

}
