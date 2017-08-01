/* T. J. Flesher
 * Bellevue University
 * Assignment 7.1 - DomesticDivision Class
 * The DomesticDivision class include a field for the state in which the division is 
 * located and a constructor that requires all fields when created.
 */
public class DomesticDivision extends Division
  {
    //variable
    String state;
    
    public DomesticDivision(String state, String dname, int acctnum){
        super(dname, acctnum); //super has to come first else error
        this.state = state;
    }
    
    public void display(){
        System.out.println("Division: " + dname);
        System.out.println("State: " + state);
        System.out.println("AcctNum: " + acctnum + "\n");
    }
  }