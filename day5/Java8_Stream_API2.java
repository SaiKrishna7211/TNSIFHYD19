package com.day5;

import java.util.*;
class Student{
	int roll_no;
	String name;
	char grade;
	public Student(int roll_no,String name,char grade) {
		this.roll_no=roll_no;
		this.name=name;
		this.grade=grade;
	}
}

public class Java8_Stream_API2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> obj=new ArrayList<Student>();
		obj.add(new Student(1,"Ram",'B'));
		obj.add(new Student(2,"Krisha",'A'));
		obj.add(new Student(3,"Arun",'B'));
		obj.add(new Student(4,"Devi",'C'));
		obj.add(new Student(5,"Raj",'A'));
		obj.add(new Student(6,"Prashu",'C'));
		
		System.out.println("Average Students are :");
		obj.stream().filter(student->student.grade=='B').forEach(student->System.out.println(student.name));
	}

}
