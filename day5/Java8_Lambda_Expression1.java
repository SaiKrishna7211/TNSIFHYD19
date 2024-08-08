package com.day5;

@FunctionalInterface
interface Example{
	public String call(String name);
}

public class Java8_Lambda_Expression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex=(name)->{
			return "hello "+name;
		};
		System.out.println(ex.call("sammu"));
	}

}
