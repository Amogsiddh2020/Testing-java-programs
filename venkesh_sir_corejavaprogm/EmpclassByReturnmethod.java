package venkesh_sir_corejavaprogm;

import java.util.Date;
import java.util.Scanner;

class EmpCheck
  {
	  boolean k;
	  boolean verify(String empId)
	  {
		  switch(empId)
		  {
		  case "A111":k=true;
		  break;
		  
		  case "A222":k=true;
		  break;
		  
		  case "A333":k=true;
		  break;
		  
		  default:k=false;
		  break;
		  }
		return (k);
		  
	  }
	  
  }

public class EmpclassByReturnmethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the empId:");
		String empId=s.nextLine();
		
		if(empId.length()==4)
		{
			EmpCheck ec=new EmpCheck();
		boolean z=ec.verify(empId);
		
		if(z)
		{
			System.out.println("login successful:");
			Date d=new Date();
			System.out.println("LoggedIn At:"+d.toString());
		}
		else
		{
			System.out.println("empId doesnot exist:");
		}
		}
		else
		{
			System.out.println("Invalid emp empId");
		}

	}

}
