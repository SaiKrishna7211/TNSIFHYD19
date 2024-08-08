package com.day5;

import java.util.*;
import java.util.stream.Collectors;
public class Java8_Stream_API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(334);
		al.add(23);
		al.add(567);
		al.add(548);
		al.add(246);
		al.add(987);
		al.add(20);
		System.out.println("printing the collection "+al);
		System.out.println();
		List<Integer> l=al.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
		System.out.println("printing the collectors with stream filter "+l);
	}

}
