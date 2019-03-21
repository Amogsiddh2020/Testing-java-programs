package venkesh_sir_6PM_batch_programs;

import java.util.Scanner;

public class SwitchcaseBasicprogm4 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your age:");
		  int age =Integer.parseInt(s.nextLine()) ;     
          switch (age)  
          {  
              case (16):            
                  System.out.println("You are under 18.");  
                  break;  
              case (18):                
                  System.out.println("You are eligible for vote.");  
                  break;  
              case (65):                
                  System.out.println("You are senior citizen.");  
                  break;  
              case (70) :
            	  //if(age>65)
            	  System.out.println("eligible for givernment facility");
              break;
              default:  
                  System.out.println("Please give the valid age.");  
                  break;  
          }
	

	}

}
