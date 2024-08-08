package com.day1;
import java.util.Scanner;
public class NumberReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		int reversedNumber=0;
		while(num!=0) {
			int digit=num%10;
			reversedNumber=reversedNumber*10+digit;
			num/=10;
		}
		System.out.println("Reversed Number: "+reversedNumber);
		sc.close();
	}

}
