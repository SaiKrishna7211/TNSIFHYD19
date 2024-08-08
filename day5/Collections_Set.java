package com.day5;
import java.util.*;
public class Collections_Set {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(5657);
		hs.add(5656744);
		hs.add(2435);
		hs.add(4564);
		System.out.println(hs);
		HashSet<String> pq=new HashSet<String>();
		pq.add("daya");
		pq.add("surya");
		pq.add("raju");
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(pq);
		Iterator<String> it=pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(hs.remove(5657));
		System.out.println(pq.remove("surya"));
		System.out.println(hs);
		System.out.println(pq);
	}
}
