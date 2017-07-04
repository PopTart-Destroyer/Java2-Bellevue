/*	T. J. Flesher
	Assignment 3.2
	Bellevue University
	July 2, 2017
	Description:  
        * Create a class named Purchase.  Each Purchase contains an invoice number, amount of sale, and amount of sales tax.  
        * Include set methods for the invoice number and sale amount.  
        * Within the set() method for the sale amount, calculate the sales tax as 7.5% (using a static field in the Purchase class) of the sale amount.  
        * Also include a display method that displays a purchase's details in a well formatted output display.  
*/
import java.util.*;

public class Purchase
  {
            //variables
        String invoiceNum;
        double saleAmt;
        double salesTax;
        double totalBill;
    //Sales tax percent static field
    private final static double TAX = .075;  
    //property invoice
    public void setInvoiceNum(String invoice){
         invoiceNum = invoice;
    }
    //property saleAmount(
    public void setSaleAmt(double amtOfSales){
        saleAmt = amtOfSales;
        salesTax = TAX * amtOfSales;
    }
    
    public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);
       
        Purchase buy = new Purchase();
         displayGreet();   
        System.out.print("Enter invoice number: ");
        buy.setInvoiceNum( sc.nextLine());
        System.out.print("\nEnter sales amount: ");
        buy.setSaleAmt( Double.parseDouble(sc.nextLine()));
        buy.totalBill = buy.saleAmt + buy.salesTax;
        buy.displaySummary(buy.invoiceNum,buy.saleAmt,buy.salesTax,buy.totalBill);
        
        System.exit(0);
        
      }
    
    public void displaySummary(String invoiceNumber, double saleAmt, double salesTax, double totalB){
       System.out.printf("\n\n~~~  Sales Summary  ~~~\n");
       System.out.printf("Invoice #: %s", invoiceNumber);
       System.out.printf("\nSales Amount: $%.2f", saleAmt);
       System.out.printf("\nSales Tax: $%.2f", salesTax);
       System.out.println("\n-----------------");
       System.out.printf("Total: $%.2f\n\n",totalB);
    }
    
    public static void displayGreet(){
        System.out.println("\n-- Welcome to the Invoice application --\n");
    }
  }
