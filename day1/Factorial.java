package com.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr a Number:");
		int num = sc.nextInt();
		int factorial=1;
		for(int i=1;i<=num;i++) {
			factorial*=i;
		}
		System.out.println("Factorial of "+num+"is "+factorial);
		sc.close();
	}

}