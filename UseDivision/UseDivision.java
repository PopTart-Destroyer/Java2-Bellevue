/* T. J. Flesher
 * Bellevue University
 * Assignment 7.1 - UseDivision Class
 * creates two instances of each of these concrete classes (4 total instances)
 */
public class UseDivision
  {
    public static void main(String[] args)
      {
            System.out.println("\n\nDisplaying Information of Organizations\n");
            System.out.println("International --");
            //initiallize InternationDivision class
            InternationalDivision interdiv1 = new InternationalDivision("French", "France","Paris Division", 345);
            interdiv1.display();
            InternationalDivision interdiv2 = new InternationalDivision("Italian", "Italy","Venice Division", 260);
            interdiv2.display();
            
            System.out.println("Domestic --");
            //initialize DomesticDivision Class
            DomesticDivision domdiv1 = new DomesticDivision("Nebraska","Husker Division", 402);
            domdiv1.display();
            DomesticDivision domdiv2 = new DomesticDivision("Colorado","Avalanche Division", 303);
            domdiv2.display();
            
            System.out.println();
            System.exit(0);
      }
  }
