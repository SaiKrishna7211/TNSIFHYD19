package built_in;

import java.util.*;
import java.lang.*;


public class BuiltinPackagesDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>=18) {
			System.out.println("eligible for voting");
		} else {
			System.out.println("not eligible for voting");
		}
		double c = Math.sqrt(a);
		double d = Math.pow(a, b);
		System.out.println("square root value is:"+c);
		System.out.println("power value is: "+d);
		 // Create a string object
	    String message = "Hello, world!";

	    // Access string length using the length() method
	    int messageLength = message.length();
	    System.out.println("The message length is: " + messageLength);

	    // Check if the string starts with a specific word using startsWith() method
	    boolean startsWithHello = message.startsWith("Hello");
	    System.out.println("Does the message start with 'Hello'? " + startsWithHello);

	    // Convert the string to uppercase using toUpperCase() method
	    String messageUppercase = message.toUpperCase();
	    System.out.println("The message in uppercase: " + messageUppercase);
	    sc.close();
	}
}