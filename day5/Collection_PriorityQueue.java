package com.day5;
import java.util.*;
public class Collection_PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("daya");
		pq.add("surya");
		pq.add("raju");
		PriorityQueue<String> prq=new PriorityQueue<String>();
		prq.add("ram");
		prq.add("arun");
		prq.add("krishna");
		pq.addAll(prq);
		System.out.println(pq);
		System.out.println(prq);
		System.out.println(pq.peek());
		System.out.println(prq.poll());
		System.out.println(prq);
		System.out.println(pq.isEmpty());
		System.out.println(prq.isEmpty());
	}

}
