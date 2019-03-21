package constructros_programs.java;

import java.util.Scanner;

class Additionn
   {
	   int no1,no2;
	    Additionn(int a,int b) 
	    {
	    	no1=a;
	    	no2=b;
	    	
	    	System.out.println("Addition constructor:");
	    	System.out.println("Addition is: "+(a+b));
	    	System.out.println();
	    	System.out.println();
	    	System.out.println();
	}
   }
public class Constructor_Parameters {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first integer no:");
		int i=s.nextInt();
		System.out.println("enter second integer no:");
		int j=s.nextInt();
		
		Additionn a=new Additionn(i, j);
		
		//Additionn aa=new Additionn(i, i);
		
		

	}

}
