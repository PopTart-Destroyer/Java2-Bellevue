/*	T. J. Flesher
	Assignment 5.1
	Bellevue University
	July 17, 2017
	SchoolTextBook.java
	Description:  
		Create a class titled SchoolTextBook that contains fields for the author, title, page count, ISBN, and price. 
		This SchoolTextBook class will also provide setter and getter methods for all fields. 
*/

public class SchoolTextBook
  {
    private String author, title, isbn;
    private int pageCount;
    private double price;
    
    //constructor
    public SchoolTextBook(String Author, String Title, String ISBN, int PageCnt, double Price ){
        author = Author;
        title = Title;
        isbn = ISBN;
        pageCount = PageCnt;
        price = Price;
    }
    
    public SchoolTextBook(){
        author = "";
        title = "";
        isbn = "";
        pageCount = 0;
        price = 0.0;
    }
    
    //getters and setters
    public void setAuthorName(String authorname){
        author = authorname;
    }
    public String getAuthorName(){
        return author;
    }
    public void setTitleName(String titlename){
        title = titlename;
    }
    public String getTitleName(){
        return title;
    }
    public void setPageCount(int pgcount){
        pageCount = pgcount;
    }
    public int getPageCount(){
        return pageCount;
    }
    public void setISBNNumber(String isbnnumber){
        isbn = isbnnumber;
    }
    public String getISBNNumber(){
        return isbn;
    }
    public void setPriceValue(double pricevalue){
        price = pricevalue;
    }
    public double getPriceValue(){
        return price;
    }
    
  }