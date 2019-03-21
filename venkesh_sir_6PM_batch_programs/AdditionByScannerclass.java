package venkesh_sir_6PM_batch_programs;

import java.util.Scanner;

class Addition
    {
    	int c;
    	
    	 void addition(int a,int b)
    	 {
    		c=a+b; 
    	 }
    	 
    	 void disAddition()
    	 {
    		 System.out.println("Addition of a & b:"+c);
    	 }
    }

public class AdditionByScannerclass {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		Addition a=new Addition();
		
		int a1,b;
		
		System.out.println("enter value of a:");
		a1=Integer.parseInt(s.nextLine());
		System.out.println("enter value of b:");
		b=Integer.parseInt(s.nextLine());
		
		a.addition(a1, b);
		a.disAddition();
	

	}

}
