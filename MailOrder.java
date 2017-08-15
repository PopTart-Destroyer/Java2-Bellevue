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
        File filename = new File("C:\\javaSource\\mailOrderData.txt");
        String delimiter = ",";
        String s = "";
        int qty;
        int itemNum;
        final int QUIT = 999;
        
       
        try{         
           if (!filename.exists()){
               filename.createNewFile();
           }
            FileWriter fw = new FileWriter(filename,true);
            BufferedWriter writer = new BufferedWriter(fw);

            System.out.print("Enter item number (999 to quit): ");
            itemNum = Integer.parseInt(sc.nextLine());
            
            while(itemNum != QUIT)
              {
                System.out.print("Enter a quantity: ");
                qty = Integer.parseInt(sc.nextLine());
                s = itemNum + delimiter + qty;
                writer.write(s, 0, s.length());
                writer.newLine();
                System.out.print("Enter item number (999 to quit): ");
                itemNum = Integer.parseInt(sc.nextLine());
            }
          writer.close();  
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
