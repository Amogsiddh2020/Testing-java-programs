package venkesh_sir_6PM_batch_programs;

class BokDetail
{
	String bkCode,bkName,bkAuthor;      //instance variables
	int price,quantity;
	
	void getBkDetail()      //     instance method OR non static method
	{
		System.out.println("Book code is: "+bkCode);
		System.out.println("Book name is: "+bkName);
		System.out.println("Author of book is: "+bkAuthor);
		System.out.println("price of book is: "+price);
		System.out.println("book quantity is: "+quantity);
	}
	}
public class BookDetail_ClassandObject {

	public static void main(String[] args) 
	{
		BokDetail bd= new BokDetail();
		//bd.getBkDetail();
		
		bd.bkCode="PSTN7856F89";   //using object assigning values to instance variables
		bd.bkName="Lect Us C";
		bd.bkAuthor="Vijay Kanetkar";
		bd.price=785;
		bd.quantity=3;
		
		bd.getBkDetail();   //method calling by using object of main class
		

	}

}
