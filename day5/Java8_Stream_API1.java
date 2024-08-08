package com.day5;

import java.util.*;
import java.util.stream.Collectors;

class Mobiles{
	int id;
	String brand_name;
	float avg_price_of_brand;
	public Mobiles(int id , String brand_name , float avg_price_of_brand) {
		this.id=id;
		this.brand_name=brand_name;
		this.avg_price_of_brand=avg_price_of_brand;
	}
}
public class Java8_Stream_API1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Mobiles> m=new ArrayList<Mobiles>();
		m.add(new Mobiles(1,"Realme",28000f));
		m.add(new Mobiles(2,"Vivo",25000f));
		m.add(new Mobiles(3,"Motorola",20000f));
		m.add(new Mobiles(4,"Oppo",30000f));
		m.add(new Mobiles(5,"OnePlus",40000f));
		m.add(new Mobiles(6,"Apple",75000f));
		m.add(new Mobiles(7,"Samsung",55000f));
		
		System.out.println("Budget Friendly  Mobiles for Middle Class Peoples:");
		m.stream().filter(mobile->mobile.avg_price_of_brand<=30000).forEach(mobile->System.out.println(mobile.brand_name));
		
		System.out.println("\n"+"Total of all Prices:");
		Float totalPrice = m.stream().map(product->product.avg_price_of_brand).reduce(0.0f,(sum, price)->sum+price);   
		System.out.println(totalPrice); 
		
		System.out.println("\n"+"Total of all Prices by referring method of Float class:");
	    float totalPrice2 = m.stream().map(product->product.avg_price_of_brand).reduce(0.0f,Float::sum);    
        System.out.println(totalPrice2);
        
        System.out.println("\n"+"Total of all Prices by referring method of Double class:");
        double totalPrice3 = m.stream().collect(Collectors.summingDouble(mobile->mobile.avg_price_of_brand));
        System.out.println(totalPrice3);
        
        System.out.println("\n"+"Maximum price & Brand Name:");
        Mobiles mb=m.stream().max((mobile1,mobile2)->mobile1.avg_price_of_brand>mobile2.avg_price_of_brand ? 1:-1).get();
        System.out.println(mb.avg_price_of_brand+" & "+mb.brand_name);
        
        System.out.println("\n"+"Minimum price & Brand Name :");
        Mobiles mb1=m.stream().min((mobile1,mobile2)->mobile1.avg_price_of_brand>mobile2.avg_price_of_brand ? 1:-1).get();
        System.out.println(mb1.avg_price_of_brand+" & "+mb1.brand_name);
	}

}
