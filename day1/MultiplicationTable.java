package com.day1;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = sc.nextInt();
		System.out.print("Enter the range:");
		int range=sc.nextInt();
		System.out.println("the Multiplication table for "+number);
		for(int i=1;i<=range;i++) {
			System.out.println(number+"*"+i+"="+(number*i));
		}
		sc.close();
	}

}
