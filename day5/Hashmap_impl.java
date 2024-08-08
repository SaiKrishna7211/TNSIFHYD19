package com.day5;
import java.util.HashMap;
public class Hashmap_impl  {
	public static void main(String[] args) {
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(1, "daya");
		hmap.put(2, "raju");
		hmap.put(3, "shiva");
		hmap.put(4, "surya");
		hmap.put(5, "tarun");
		System.out.println(hmap);
		System.out.println(hmap.get(4));
		System.out.println(hmap.remove(3));
		System.out.println(hmap);
	}
}
