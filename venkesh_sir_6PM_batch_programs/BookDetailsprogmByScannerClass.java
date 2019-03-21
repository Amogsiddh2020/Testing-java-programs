package venkesh_sir_6PM_batch_programs;

import java.util.Scanner;

class BookDetails1   //sub class
      {
    	  String bookCode, bookName,authorName;  // instance variables
    	  double bookPrice;            //instance variables
    	  int bookQuantity;      //instance method
    	  
    	  void getBookDetails()
    	  {
    		  System.out.println("Book Code is: "+bookCode);
               System.out.println("Book Name is: "+bookName);
               System.out.println("Book Author Name is: "+authorName);
               System.out.println("Book Price is: "+bookPrice);
               System.out.println("Book Quantity is: "+bookQuantity);
               System.out.println("****************************************************");
               }
      }
      

public class BookDetailsprogmByScannerClass   //main class
{

	public static void main(String[] args)      //static method
	{
		Scanner s=new Scanner(System.in);   //object creation
		
		BookDetails1 bd=new BookDetails1();
		
		System.out.println("enter the book code:");
		bd.bookCode=s.nextLine();     //method calling
		
		System.out.println("enter the book name: ");
		bd.bookName=s.nextLine();
		
		System.out.println("enter the author name  of book: ");
		bd.authorName=s.nextLine();
		
		System.out.println("enter the book price is:");
		bd.bookPrice=Float.parseFloat(s.nextLine());
		
		System.out.println("enter the quantity of book: ");
		bd.bookQuantity=Integer.parseInt(s.nextLine());
		
		bd.getBookDetails();  //method caling by obejct of class
		

	}

}
