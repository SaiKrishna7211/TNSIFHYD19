package com.day4;
import java.util.Scanner;
public class Multi_Dimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int i,j;
		System.out.println("enter A matrix values:");
		for (i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter B matrix values:");
		for (i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Addition of A & B matrices :");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
