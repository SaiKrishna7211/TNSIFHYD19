package com.day1;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0) {
			sum+=num%10;
			num=num/10;
		}
		System.out.println("Sum of Digits: "+sum);
		sc.close();
	}

}
