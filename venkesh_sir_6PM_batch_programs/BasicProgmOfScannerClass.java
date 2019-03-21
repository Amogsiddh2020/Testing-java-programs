package venkesh_sir_6PM_batch_programs;

import java.util.Scanner;

class Student
{
	int rollNo;
	String name,branch;
	
	
	void getStudInfo()
	{
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name is: "+name);
		System.out.println("Branch is: "+branch);
		
	}
}
	

public class BasicProgmOfScannerClass {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		Student s=new Student();
		System.out.println("enter the rollno:");
		s.rollNo=Integer.parseInt(s1.nextLine());
		
		System.out.println("enter student name: ");
		s.name=s1.nextLine();
		
		System.out.println("enter the branch name of student:");
		s.branch=s1.nextLine();
		
		
      s.getStudInfo();
	

}
}
