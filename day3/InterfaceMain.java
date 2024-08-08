package com.day3;

public class InterfaceMain {
	public static void main(String[] args) {
		InterfaceDemo1 sbi =new InterfaceDemo1();
		sbi.loan();
		sbi.roi(12);
		sbi.goldloan();
		sbi.intrest_on_glod(1.8);
		System.out.println("**************************");
		InterfaceDemo2 hdfs = new InterfaceDemo2();
		hdfs.loan();
		hdfs.roi(8);
		hdfs.goldloan();
		hdfs.intrest_on_glod(1.5);
		System.out.println("**************************");
		InterfaceDemo3 icici = new InterfaceDemo3();
		icici.loan();
		icici.roi(7.8);
		icici.goldloan();
		icici.intrest_on_glod(1.6);
	}
}
