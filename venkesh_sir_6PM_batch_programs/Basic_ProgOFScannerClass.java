package venkesh_sir_6PM_batch_programs;

import java.util.Scanner;

class Product
{
	String pName,PCode;    //instance variables
	float pPrice;
	int pQuantity;      //instance variables
	
	void getProductDtls()    //instance methods
	{
		System.out.println("product name: "+pName+"\n");
		System.out.println("product code: "+PCode+"\n");
		System.out.println("product price is: "+pPrice+"\n");
		System.out.println("product quantity is: "+pQuantity);
		
	}
	
}

public class Basic_ProgOFScannerClass {

	public static void main(String[] args)     //static methods
	{
		Scanner s=new Scanner(System.in);
		
		Product p= new Product();       //method calling by object
		System.out.println("enter the product name:");
		p.pName=s.nextLine();
		
		System.out.println("enter the product code:");
		p.PCode=s.nextLine();
		
		System.out.println("enter the product price:");
		p.pPrice=s.nextFloat();
		
		System.out.println("enter the product quantity:");
		p.pQuantity=s.nextInt();       //method calling by object
		
		p.getProductDtls();  //method calling by object
		
		

	}

}
