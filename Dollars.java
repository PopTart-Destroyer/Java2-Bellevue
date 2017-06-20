/*	T. J. Flesher
	Assignment 1.1
	Bellevue University
	June 19, 2017
	Create a class that calculates and displays the conversion of an entered number of dollars into currency denominations - 100s, 50s, 20s, 10s, 5s, and 1s.  Obtain all inputs and display all outputs using dialog boxes.  Save the class as Dollars.Java. 
*/

import java.util.*;
import javax.swing.*;

public class Dollars 
{
	public static void main(String[] args)
	{
		
		long oDollars;		//original dollars
		//variables for denominations
		long Franklins;
		int Grants, Jacksons, Hamiltons, Lincolns, Washingtons;
		
		String oAmount = JOptionPane.showInputDialog(null,"Please enter dollar amount. Example: 543");
		
		oDollars = Long.parseLong(oAmount);
		
		Franklins = (long) oDollars / 100;
		oDollars = oDollars % 100;
		
		Grants = (int) oDollars / 50;
		oDollars = oDollars % 50;
		
		Jacksons = (int) oDollars / 20;
		oDollars = oDollars % 20;
		
		Hamiltons = (int) oDollars / 10;
		oDollars = oDollars % 10;
		
		Lincolns = (int) oDollars / 5;
		oDollars = oDollars % 5;
		
		Washingtons = (int) oDollars / 1;
		oDollars = oDollars % 1;
		
		JOptionPane.showMessageDialog(null,"Entered Amount: $" + oAmount + "\n# of 100s: " + Franklins +
			"\n# of 50s: " + Grants + "\n# of 20s: " + Jacksons + "\n# of 10s: " + Hamiltons + 
			"\n# of 5s: " + Lincolns + "\n# of 1s: " + Washingtons);
			
		// System.out.println("Original amount: " + oAmount);
		// System.out.println("# of 100's " + Franklins + "\n# of 50's " + Grants + 
		// "\n# of 20's " + Jacksons + "\n# of 10's " + Hamiltons + 
		// "\n# of 5's " + Lincolns + "\n# of 1's " + Washingtons);
		
		// System.exit(0);
		
	}
}