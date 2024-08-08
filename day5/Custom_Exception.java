package com.day5;
import java.util.Scanner;
class WordContainException extends Exception{
	public WordContainException(String Exception_Occured) {
		super(Exception_Occured);
	}
}

class Custom_Exception {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word;
		System.out.println("enter a word:");
		try {
			word=sc.nextLine();
			if(word.contains("s")) {
				throw new WordContainException("Exception_Occured");
			}
			
		}catch(WordContainException ex) {
			System.out.println("word contains 's' letter");
			ex.printStackTrace();
		}finally {
			System.out.println("rest of the code......");
		}
	}
}
