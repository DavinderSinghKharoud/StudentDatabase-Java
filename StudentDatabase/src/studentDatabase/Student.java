package studentDatabase;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses="";
	private int tutionBalance=0;
	private int costOfCourse = 600;
	private static int id = 1000;
	
	//Constructor
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first Name: ");
		this.firstName=in.nextLine();
		
		System.out.print("Enter student last Name: ");
		this.lastName=in.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Junior\n3 - Intermediate\n4 - Senior"
				+ "\nEnter student class level: ");
		this.gradeYear=in.nextLine();
		
		setStudentID();
			
		
		
	}
    
	//Generate an ID
	private void setStudentID() {
		//Grade level + ID
		id++;
		this.studentID= gradeYear+""+id;
	}
	
	//Enroll in courses
	public void enroll() {
		//Get inside a loop, user hits 0
		do {
			
		
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in =new Scanner(System.in);
			String course=in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tutionBalance=tutionBalance + costOfCourse;
			}
			else {break;}
			
		}while(1 != 0);
		
	}
	
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is: $"+tutionBalance);
		
	}
	
	//Pay Tution
	public void payTution() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in=new Scanner(System.in);
		int payment=in.nextInt();
		tutionBalance=tutionBalance - payment;
		System.out.println("Thank you for payment of $"+payment);
		viewBalance();
	}
	
	//Show status
	public String toString() {
		return "Name: "+firstName+" "+lastName+
				"\nGrade Level: "+gradeYear+
				"\nStudent Id: "+studentID+
				"\nCourses Enrolled: "+courses+
				"\nBalances: $"+tutionBalance;
	}
	

}
