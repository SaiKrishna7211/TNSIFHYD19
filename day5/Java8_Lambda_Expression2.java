package com.day5;

@FunctionalInterface
interface Calling{
	public void callme(String name);
}

public class Java8_Lambda_Expression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calling c=(name)->{
			System.out.println("she call me as "+name);
		};
		c.callme("Kanna");
	}

}
