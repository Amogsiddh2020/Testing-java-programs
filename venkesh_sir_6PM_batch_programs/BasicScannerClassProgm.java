package venkesh_sir_6PM_batch_programs;

import java.util.Scanner;

class Student1
{
	String name,branch;   //instance variables
	int rollNo;
	double  percentage;
	
	void getStudentDtls() //instance methods
	{
	System.out.println("Name of student is: "+name);
	System.out.println("Branch of student is: "+branch);
	System.out.println("roll number of student is: "+rollNo);
	System.out.println("percentage of student is: "+percentage);
	
	}
	}

public class BasicScannerClassProgm {

	public static void main(String[] args)   //static method
	{
		Scanner s=new Scanner(System.in);
		Student1 s1= new Student1();   //object creation 
		
		System.out.println("enter the name of student is: ");
		s1.name=s.nextLine();  //method calling
		
		System.out.println("enter the branch of student is: ");
		s1.branch=s.nextLine();
		
		System.out.println("enter the roll nymber of student:");
		s1.rollNo=Integer.parseInt(s.nextLine());
		
		System.err.println("enter the percentage of student: ");
       // s1.percentage=Float.parseFloat(s.nextLine());
        s1.percentage=Double.parseDouble(s.nextLine());
     
        s1.getStudentDtls();  //method calling

	}

}
