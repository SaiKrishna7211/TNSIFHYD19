package com.day1;
import java.util.Scanner;
public class SumOfNaturalNumabers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println("The sum of natural numbers upto "+num+" is "+sum);
		sc.close();
	}

}
