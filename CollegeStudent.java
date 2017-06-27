/*	T. J. Flesher
	Assignment 2.2
	Bellevue University
	June 25, 2017
	Description:  
	Create a CollegeStudent class.  This class will contain data fields that hold a student's first name, last name, enrollment date, and projected graduation date, using the GregorianCalendar class for each date.  
	Provide get() and set() methods for each field.  Also provide a constructor that requires first and last names and enrollment date, and sets the project graduation date to exactly four years after enrolment.  
	Save the class as CollegeStudent.java.
*/

import java.util.*;

public class CollegeStudent
{
	//variables
	String fName;
	String lName;
	GregorianCalendar enrollDate;
	GregorianCalendar gradDate;
	
	
	//constructor
	public CollegeStudent(String firstName, String lastName, GregorianCalendar enrollmentDate){
		fName = firstName;
		lName = lastName;
		enrollDate = enrollmentDate;
		gradDate = new GregorianCalendar(
								enrollDate.get(enrollmentDate.YEAR),
								enrollDate.get(enrollmentDate.MONTH),
								enrollDate.get(enrollmentDate.DAY_OF_MONTH));
		gradDate.add(enrollmentDate.YEAR,4);
								
	}

	
	//method for FirstName
	public String getFirstName() {
		return fName;
	}
	public void setFirstName(String firstname){
		fName = firstname;
	}
	//method for LastName
	public String getLastName() {
		return lName;
	}
	public void setLastName(String lastname){
		lName = lastname;
	}
	//method for Enrollment Date
	public GregorianCalendar getEnrollDate(){
		return enrollDate;
	}
	public void setEnrollDate(GregorianCalendar eDate){
		enrollDate = eDate;
	}

}