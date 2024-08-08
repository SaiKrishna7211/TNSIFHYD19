package com.day2;
import java.util.Scanner;
public class LoopingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a two digit number:");
		int n= sc.nextInt();
		int sum=0;
		System.out.println("table is:");
		for(int i=1;i<=5;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		System.out.println("while value is: "+sum);
		do {
			sum+=n%10;
			n/=10;
			System.out.println("do_while value is: "+sum);
		}while(n>0);
		System.out.println("for_each loop values: ");
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
		sc.close();
	}

}
