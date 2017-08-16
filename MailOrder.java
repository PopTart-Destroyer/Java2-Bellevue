/*	T. J. Flesher
	Assignment 9.1
	Bellevue University
	August 14, 2017
	Description:  
	Write an application for a mail order company. The program uses a data entry screen in which the user types an item number and a quantity. 
	Write each record to a file. Save your file as MailOrder.java.
*/

import java.io.*;
import java.util.*;

public class MailOrder
  {
     public static void main(String[] args) throws IOException
      {
        Scanner sc = new Scanner(System.in);
		// Define file directory for creation!
        File file = new File("C:\\Java\\mailOrderData.txt");
        String delimiter = ",";	
        String s = "";
        int qty;
        int itemNum;
        final int QUIT = 999;	//Optional, change to favoriate quit numbers
               
        try{      
			//checking if directory exists, if not create it!
			if (!file.exists()){
				//getParentFile() method returns the abstract pathname of this abstract pathname's parent
				if(file.getParentFile().mkdir()){ 
					System.out.println("Directory is created!");
				}
				else
				{
					System.out.println("Failed to create directory!");
					
				}
			}
			//check if file exists, if not create it!
           if (!file.exists()){
               file.createNewFile();
			   System.out.println("File created!\n");
           } 
			//file writer IO
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter writer = new BufferedWriter(fw);
			//Get user input
            System.out.print("Enter item number ("+QUIT+" to quit): ");
            itemNum = Integer.parseInt(sc.nextLine());	//parse out Int and clear buffer
            
            while(itemNum != QUIT)
              {
                System.out.print("Enter a quantity: ");
                qty = Integer.parseInt(sc.nextLine());  //parse out Int and clear buffer
                s = itemNum + delimiter + qty;	//format input
                writer.write(s, 0, s.length());	//write output
                writer.newLine();	//create new line for next set of outputs
                System.out.print("Enter item number ("+QUIT+" to quit): ");
                itemNum = Integer.parseInt(sc.nextLine());  //parse out Int and clear buffer
            }
          writer.close();  //close writer
        }
        catch(NumberFormatException nfe){		
            System.out.println("Message: " + nfe);
            System.out.println("Program Ending..");
            System.exit(0);
        }
        catch(Exception e){
            System.out.println("Message: " + e);
            System.out.println("Program Ending..");
            System.exit(0);
        }
        finally{
            System.out.println("Program Ending..");
            System.exit(0);
      }
              
      }
  }
