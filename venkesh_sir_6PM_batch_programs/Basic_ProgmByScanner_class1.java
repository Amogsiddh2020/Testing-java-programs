package venkesh_sir_6PM_batch_programs;

import java.util.Scanner;

class EmpDetails1
{
	String empId,empName,empDesg;
	
	void getEmpDetails()
	{
		System.out.println("emp Id is: "+empId+"\n");
		System.out.println("emp Name is: "+empName+"\n");
		System.out.println("emp Desgnition is: "+empDesg+"\n");
		System.out.println("****************************************");
		
	}
	
}

    class EmpContact1
    {
    	String mailId;
    	long pNo;
    	
    	void getEmpContact()
    	{
    		
    		System.out.println("emp phone no: "+pNo+"\n");
    		System.out.println("emp mailId is: "+mailId+"\n");
    		System.out.println("************************************");
    	}
    	
    }
    
    class EmpAddress1
    {
    	String hno,sname,city;
    	long pinCode;
    	
    	
    	void getEmpAddress()
    	{
    		System.out.println("emp house no: "+hno+"\n");
    		System.out.println("house street name is: "+sname+"\n");
    		System.out.println("emp city name: "+city+"\n");
    		System.out.println("pincode of city is: "+pinCode);
    		System.out.println("******************************************");
    	}
    }

public class Basic_ProgmByScanner_class1 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		EmpDetails1 ed=new EmpDetails1();
		
		EmpContact1 ec=new EmpContact1();
		
		EmpAddress1 ea=new EmpAddress1();
		
		System.out.println("enter emp Id: ");
		ed.empId=s.nextLine();
		
		System.out.println("enter the emp name: ");
		ed.empName=s.nextLine();
		
		System.out.println("enter the emp desgnition");
       ed.empDesg=s.nextLine();
       
       System.out.println("enter the phone no: ");
       ec.pNo=Long.parseLong(s.nextLine());
       System.out.println("enter the mail id: ");
       ec.mailId=s.nextLine();
       
       
       System.out.println("enter House No: ");
       ea.hno=s.nextLine();
       
       System.out.println("enter the street name: ");
       ea.sname=s.nextLine();
       
       System.out.println("enter the city name: ");
       ea.city=s.nextLine();
       
       System.out.println("enter the pincode: ");
       ea.pinCode=Long.parseLong(s.nextLine());
       
       ed.getEmpDetails();
       
       ec.getEmpContact();
       
       ea.getEmpAddress();
		

	}

}
