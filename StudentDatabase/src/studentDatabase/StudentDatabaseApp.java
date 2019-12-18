package studentDatabase;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {

	//How many Students we want to add
		System.out.println("Enter number of new Students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		
		//Create number of new Students	
		for(int n = 0;n <numOfStudents; n++) {
			students[n]=new Student();
			students[n].enroll();
			students[n].payTution();
			System.out.println();
		}
		
		for(int n = 0;n <numOfStudents; n++) {

			System.out.println("*************************");
			System.out.println(students[n].toString()+"\n");
		}
	}
	
}
