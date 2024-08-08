package com.day5;
import java.io.*;
import java.util.*;
public class Collections_Stack {
	public static void main(String[] args) {
		Stack<String> st=new Stack<String>();
		st.push("surya");
		st.push("daya");
		st.push("raju");
		st.push("tarun");
		st.push("shivaraj");
		st.pop();
		st.pop();
		Iterator<String> itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
	}
}
