/* T. J. Flesher
 * Bellevue University
 * Assignment 7.1 - Division Class
 * Create an abstract Division class with fields for a company's division name and account number, and an abstract display() method that will be defined in the subclasses.  
 * Use a constructor in the superclass that requires values for both fields.
 */
public abstract class Division
  {
    //variables
    String dname;
    int acctnum;
    
    //abstract method for displaying values
    public abstract void display();
    
    //constructor
    public Division(String dname, int acctnum){
        //super();
        this.dname = dname;
        this.acctnum = acctnum;
    }
  }