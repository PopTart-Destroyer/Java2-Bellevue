/*	T. J. Flesher
	Assignment 2.2
	Bellevue University
	June 25, 2017
	Description:  
	Create an interactive application that prompts the user for data for two CollegeStudent objects.  
	Prompt the user for first name, last name, enrollment month, enrollment day, and enrollment year for each CollegeStudent, and then instantiate the objects.  
	Display all the values, including the projected graduation dates.  
	Save the application as TestCollegeStudent.java

*/

import java.util.*;

public class TestCollegeStudent {
	
	
	public static void main(String[] args) {
		TestCollegeStudent tcs = new TestCollegeStudent();
		Scanner scanner = new Scanner(System.in);
		
		//Program info
		System.out.println("\n\n\nThis application collects college student information and \n" +
						   "and displays First/Last Name and Graduation Date");
		
		//Prompt user for first student
		System.out.println("\n\n\n-- College Student 1 entry --");
		System.out.print("Enter first name: ");
		String s1_Firstname = scanner.nextLine();
		
		System.out.print("Enter last name: ");
		String s1_Lastname = scanner.nextLine();
		
		System.out.print("Enter enrollment month: ");
		int s1_eMonth = scanner.nextInt();
		
		System.out.print("Enter enrollment day: ");
		int s1_eDay = scanner.nextInt();
		
		System.out.print("Enter enrollment year: ");
		int s1_eYear = scanner.nextInt();
		
		//Prompt user for second student
		System.out.println("\n\n\n-- College Student 2 entry --");
		System.out.print("Enter first name: ");
		String s2_Firstname = scanner.next();
		
		System.out.print("Enter last name: ");
		String s2_Lastname = scanner.next();
		
		System.out.print("Enter enrollment month: ");
		int s2_eMonth = scanner.nextInt();
		
		System.out.print("Enter enrollment day: ");
		int s2_eDay = scanner.nextInt();
		
		System.out.print("Enter enrollment year: ");
		int s2_eYear = scanner.nextInt();

		//
		GregorianCalendar gregCal1 = new GregorianCalendar(s1_eYear,s1_eMonth,s1_eDay);
		
		CollegeStudent s1 = new CollegeStudent(s1_Firstname,s1_Lastname,gregCal1);
		
		//
		GregorianCalendar gregCal2 = new GregorianCalendar(s2_eYear,s2_eMonth,s2_eDay);
		
		CollegeStudent s2 = new CollegeStudent(s2_Firstname,s2_Lastname,gregCal2);
		
		//display student data
		tcs.displayInfo(s1,"1");
		
		tcs.displayInfo(s2,"2");
		
		System.exit(0);
	}

		public void displayInfo(CollegeStudent obj, String str){
		System.out.println("\n\n\n\n--- Student " + str + " Data ---");
		System.out.println("First name: " + obj.fName);
		System.out.println("Last name: " + obj.lName);
		System.out.println("Entrollment date: " + obj.enrollDate.get(GregorianCalendar.MONTH) + "/" + obj.enrollDate.get(GregorianCalendar.DAY_OF_MONTH) + "/" + obj.enrollDate.get(GregorianCalendar.YEAR) );
		System.out.println("Approx. graduation date: " + obj.gradDate.get(GregorianCalendar.MONTH) + "/" + obj.gradDate.get(GregorianCalendar.DAY_OF_MONTH) + "/" + obj.gradDate.get(GregorianCalendar.YEAR) );
		}
	
}