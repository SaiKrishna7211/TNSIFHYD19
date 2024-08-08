package com.day1;
import java.util.Scanner;
public class MaxMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements of the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("maximum element in the array: "+max);
		System.out.println("minimum element in the array: "+min);
		sc.close();
	}

}
