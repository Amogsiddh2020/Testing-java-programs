package venkesh_sir_6PM_batch_programs;

import java.util.Scanner;

class StudDtl
{
	String name,branch;
	int rollNo;
	
	void getStudDtl()
	{
		System.out.println("student roll number is: "+rollNo);
		System.out.println("student name is: "+name);
		System.out.println("student branch is: "+branch);
	}
	
}

       class StudContact
       {
    	   String mailId;
    	   long pNo;
    	   
    	   void getStuContact()
    	   {
    		   System.out.println("student mail id is: "+mailId);
    		   System.out.println("student phone number is: "+pNo);
    		   System.out.println("*******************************");
    		    }
       }

public class BasicProgm_ClassandObject {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		StudDtl sd=new StudDtl();
		StuContact sc=new StuContact();
		
		System.out.println("enter student roll no:");
		sd.rollNo=Integer.parseInt(s.nextLine());
		System.out.println("enter student name:"+"\n");
		sd.name=s.nextLine();
		System.out.println("enter the branch of student:");
		sd.branch=s.nextLine();
		
		
	
		System.out.println("enter mail ID of student:");
		sc.mailId=s.nextLine();
		
		System.out.println("enter phone number:");
		sc.pNo=Long.parseLong(s.nextLine());
		
		sd.getStudDtl();
		sc.getStuContact();

	}

}
