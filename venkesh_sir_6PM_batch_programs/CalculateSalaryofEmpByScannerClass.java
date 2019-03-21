package venkesh_sir_6PM_batch_programs;

import java.util.Scanner;

class CalSalary
    {
    	float toSal;
    	void calculate(int bSal)
    	{
    		toSal=bSal+(0.93F*bSal)+(0.73F*bSal);
    		}
    	void toSalary()
    	{
    		System.out.println("Total salary is: "+toSal);
    	}
    }

public class CalculateSalaryofEmpByScannerClass 
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	
	CalSalary c=new CalSalary();
	
	System.out.println("enter the Basic salary: ");
    int bSal=Integer.parseInt(sc.nextLine());
    
    
          if(bSal>=5000)
        	  
          {
        	  c.calculate(bSal);
        	  c.toSalary();
          }
          
          else
          {
        	  System.out.println("InValid Basic salary");
        	  
          }
          
	}

}
