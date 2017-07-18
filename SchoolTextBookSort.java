/*	T. J. Flesher
	Assignment 5.1
	Bellevue University
	July 17, 2017
	SchoolTextBookSort.java
	Description:  
		Write an application with an array that holds 5 instances of the SchoolTextBook class, filled without prompting the user for input. 
		Next prompt the used to enter a field for sorting, sort the array of objects based on the user input, and then display the newly sorted array of objects.
*/

import java.util.*;

public class SchoolTextBookSort
  {

    public static void main(String[] args)
      {
        //scanner for user input
        Scanner sc = new Scanner(System.in);

        //array for 5 instances
        SchoolTextBook[] books = new SchoolTextBook[5];

        //filling array with data
        //set 1
        books[0] = new SchoolTextBook();
        books[0].setAuthorName("Clive Cussler");
        books[0].setTitleName("Corsair");
        books[0].setPageCount(545);
        books[0].setISBNNumber("978-0-425-23329");
        books[0].setPriceValue(10.99);
        //set 2
        books[1] = new SchoolTextBook();
        books[1].setAuthorName("Clive Cussler");
        books[1].setTitleName("The Assassin");
        books[1].setPageCount(406);
        books[1].setISBNNumber("978-0-425-28017");
        books[1].setPriceValue(8.99);
        //set 3
        books[2] = new SchoolTextBook();
        books[2].setAuthorName("Clive Cussler");
        books[2].setTitleName("The Bootlegger");
        books[2].setPageCount(435);
        books[2].setISBNNumber("978-0-425-27281");
        books[2].setPriceValue(9.99);
        //set 4
        books[3] = new SchoolTextBook();
        books[3].setAuthorName("Angelo Van Bogart");
        books[3].setTitleName("HotWheels Celebrating 40 Years");
        books[3].setPageCount(253);
        books[3].setISBNNumber("978-0-89689-568-3");
        books[3].setPriceValue(30.0);
        //set 5
        books[4] = new SchoolTextBook();
        books[4].setAuthorName("Terry Felke-Morris");
        books[4].setTitleName("Web Development with HTML5");
        books[4].setPageCount(648);
        books[4].setISBNNumber("978-0-13-278339-2");
        books[4].setPriceValue(52.99);

        System.out.println("Welcome to the School Text Book Program.");
        //display menu
        Menu();
        //get user input
        while (!sc.hasNextInt())
          {
            String input = sc.next();
            System.out.printf("\nINFORMATION - %s is not an available choice\n\n", input);
            Menu();
          }
        int choice = sc.nextInt();
        //switch to take action for sorting feature
        switch (choice)
          {
            case 1:
                //Author sort
                sortByAuthor(books);
                //print sorted 
                displayResults(books, "Author");
                break;
            case 2:
                //Title sort
                sortByTitle(books);
                //print sorted 
                displayResults(books, "Title");
                break;
            case 3:
                //ISBN sort
                sortByISBN(books);
                //print sorted 
                displayResults(books, "ISBN");
                break;
            case 4:
                //Page count sort
                sortByPages(books);
                //print sorted 
                displayResults(books, "Pages");
                break;
            case 5:
                //Price sort
                sortByPrice(books);
                //print sorted 
                displayResults(books,"Price");
                break;
            default:
                System.out.println("Sorry, books can't be sorted right now, try again later.");
                System.out.println("Program ending..");
                break;
          }
        System.exit(0);
      }

    public static void Menu()
      {
        System.out.println("Sorting by the following options: \n 1 - Author\n 2 - Title\n 3 - ISBN\n"
                + " 4 - Page Count\n 5 - Price");
        System.out.print("Enter your choice (1-5): ");
      }//end Menu

    public static void sortByAuthor(SchoolTextBook[] books)
      {
        SchoolTextBook temp;
        for (int i = 0; i < books.length - 1; i++)
          {
            for (int j = 0; j < books.length - 1; j++)
              {
                //compareTo method 
                if (books[j].getAuthorName().compareTo(books[j + 1].getAuthorName()) > 0)
                  {
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                  }
              }
          }
      }//end sortByAuthor

    public static void sortByTitle(SchoolTextBook[] books)
      {
        SchoolTextBook temp;
        for (int i = 0; i < books.length - 1; i++)
          {
            for (int j = 0; j < books.length - 1; j++)
              {
                //compareTo method 
                if (books[j].getTitleName().compareTo(books[j + 1].getTitleName()) > 0)
                  {
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                  }
              }
          }
      }//end sortByTitle

    public static void sortByISBN(SchoolTextBook[] books)
      {
        SchoolTextBook temp;
        for (int i = 0; i < books.length - 1; i++)
          {
            for (int j = 0; j < books.length - 1; j++)
              {
                //compareTo method 
                if (books[j].getISBNNumber().compareTo(books[j + 1].getISBNNumber()) > 0)
                  {
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                  }
              }
          }
      }//end sortByISBN

    public static void sortByPages(SchoolTextBook[] books)
      {
        SchoolTextBook temp;
        for (int i = 0; i < books.length - 1; i++)
          {
            for (int j = 0; j < books.length - 1; j++)
              {
                //compareTo method 
                if (books[j].getPageCount() > books[j + 1].getPageCount())
                  {
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                  }
              }
          }
      }//end sortByPages
    
        public static void sortByPrice(SchoolTextBook[] books)
      {
        SchoolTextBook temp;
        for (int i = 0; i < books.length - 1; i++)
          {
            for (int j = 0; j < books.length - 1; j++)
              {
                //compareTo method 
                if (books[j].getPriceValue() > books[j + 1].getPriceValue())
                  {
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                  }
              }
          }
      }//end sortByPrice

    public static void displayResults(SchoolTextBook[] books, String sortBy)
      {
        System.out.printf("\nResults, sorted by: %s\n", sortBy);
        System.out.printf("\n%-20s%-35s%-25s%-10s%-8s\n", "Author", "Title", "ISBN", "Pages", "Price");
        System.out.printf("%-20s%-35s%-25s%-10s%-8s\n", "--------", "-------", "------", "------", "-------");
        for (int b = 0; b < books.length; b++)
          {
            System.out.printf("%-20s%-35s%-25s%-10s$%-8.2f\n", books[b].getAuthorName(), books[b].getTitleName(),
                    books[b].getISBNNumber(), books[b].getPageCount(), books[b].getPriceValue());
          }
      }// end displayResults
  }