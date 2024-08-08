package com.day2;
import java.util.Scanner;
public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your age: ");
		int age = sc.nextInt();
		if(age>=18) {
			if(age>=60) {
				System.out.println("you are oldage person");
			}else if(age>=30 && age<60) {
				System.out.println("you are middle age person");
			}else if(age>=25 && age<30) {
				System.out.println("you are young person");
			}else {
				System.out.println("you are an adult");
			}
			System.out.println("you are eligible for voting");
		}else {
			System.out.println("you are not eligible for voting");
		}
		sc.close();
	}

}
