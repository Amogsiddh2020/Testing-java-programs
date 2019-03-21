package venkesh_sir_6PM_batch_programs;

import java.util.Scanner;

public class BasicSwitchcaseProgm {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your choice case:");
		  int number=Integer.parseInt(s.nextLine());
		    //Switch expression  
		    switch(number){  
		    //Case statements  
		    case 10: System.out.println("10");  
		    break;  
		    case 20: System.out.println("20");  
		    break;  
		    case 30: System.out.println("30");  
		    break;  
		    //Default case statement  
		    default:System.out.println("Not in 10, 20 or 30");  
		    break;
		    }  

	}

}
