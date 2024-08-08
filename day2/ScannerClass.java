package com.day2;
import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("enter string: ");
		String str=sc.nextLine();
		System.out.println("string: "+str);
		System.out.print("enter integer:");
		int a=sc.nextInt();
		System.out.println("integer: "+a);
		System.out.print("enter float:");
		float c= sc.nextFloat();
		System.out.println("float: "+c);
		System.out.print("enter double:");
		double d=sc.nextDouble();
		System.out.println("double: "+d);
		System.out.print("enter boolean:");
		boolean e=sc.nextBoolean();
		System.out.println("boolean: "+e);
		System.out.print("enter char:");
		char f=sc.next().toCharArray()[0];
		System.out.println("char: "+f);
		System.out.print("enter byte:");
		byte g=sc.nextByte();
		System.out.println("byte: "+g);
		sc.close();
	}

}
