package com.day1;
import java.util.Scanner;
public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("enter the elements of the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int num:arr) {
			sum+=num;
		}
		System.out.println("Sum of elements of array is: "+sum);
		sc.close();
	}

}
