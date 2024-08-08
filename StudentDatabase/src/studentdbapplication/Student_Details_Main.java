package studentdbapplication;

import java.util.Scanner;

public class Student_Details_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of new students to enroll: ");
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		Student_Details[] students = new Student_Details[numOfStudents];
		
		// Create n number of new students
		for (int n  = 0; n < numOfStudents; n++) {
			students[n] = new Student_Details();
			students[n].enroll();
			students[n].payTuition();
	    }
		
		for (int n  = 0; n < numOfStudents; n++) {
			System.out.println(students[n].toString());
		}
		sc.close();
	}

}
