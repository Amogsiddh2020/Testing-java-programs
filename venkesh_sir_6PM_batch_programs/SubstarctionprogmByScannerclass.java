package venkesh_sir_6PM_batch_programs;

import java.util.Scanner;

class Subtraction
          {
        	  int c;
        	  
        	  void subtraction(int a,int b)
        	  {
        		  c=a-b;
        		  }
        	  
        	  void subtractionDis()
        	  {
        		  System.out.println("subtraction of a & b is : "+c);
        	  }
          }

public class SubstarctionprogmByScannerclass {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Subtraction s=new Subtraction();
		
		int p,q;
		
		System.out.println("enter the value of p & q:");
		p=Integer.parseInt(sc.nextLine());
		q=Integer.parseInt(sc.nextLine());
		
		s.subtraction(p, q);
		s.subtractionDis();
		

	}

}
