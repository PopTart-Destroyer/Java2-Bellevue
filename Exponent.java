/*	T. J. Flesher
	Assignment 2.1
	Bellevue University
	June 25, 2017
	Description:  
	Create a public class named Exponent.  Inside the main method of this class, obtain a double input using a dialog box.  
	Pass the input value to a non-static method that returns the square value of the parameter.  
	Display the return value of the method using an output dialog.  
	Next pass the input value to a non-static method that returns the cube of the parameter.  
	Display the return value of the method using an output dialog
*/

import java.util.*;
import javax.swing.*;
import java.lang.*;

public class Exponent 
{
	public static void main(String[] args)
	{
		Exponent expo = new Exponent();
		
		//get user input
		String input = JOptionPane.showInputDialog(null,"Enter a value (Example: 1.8)" );
		double dInput = Double.parseDouble(input);
		
		//display the square value
		JOptionPane.showMessageDialog(null,"The square of " + dInput + " is " + expo.Square(dInput));
		//display the cube value
		
		JOptionPane.showMessageDialog(null,"The cube of " + dInput + " is " + String.format("%.4f", expo.Cube(dInput)));
		
		System.exit(0);
	}	
	
		//method for square value
		public double Square(double sq) {
			double tmpValue = Math.pow(sq,2);
			return tmpValue;
		}
		//method for cube value
		public double Cube(double c) {
			double tmpValue = Math.pow(c,3);
			return tmpValue;
		}
	
}