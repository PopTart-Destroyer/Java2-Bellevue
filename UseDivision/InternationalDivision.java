/* T. J. Flesher
 * Bellevue University
 * Assignment 7.1 - InternationalDivision Class
 * The InternationalDivision class includes a field for the country in which the division is located, 
 * a field for the language spoken, and a constructor that requires all fields when created.
 */
public class InternationalDivision extends Division
  {
   //variables
    String language, country;
    
    public InternationalDivision(String language, String country, String dname, int acctnum){
        super(dname, acctnum);
        this.language = language;
        this.country = country;
    }
    public void display(){
        System.out.println("Division: " + dname);
        System.out.println("Country: "+ country);
        System.out.println("Language used: " + language);
        System.out.println("AcctNum: "+ acctnum + "\n");
    }
  }