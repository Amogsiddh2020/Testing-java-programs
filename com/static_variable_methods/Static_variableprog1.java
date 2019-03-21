package com.static_variable_methods;

import java.util.Scanner;

class Stud
   {
	   
	   static int rollNo;
	   String name;
	   
	   
	   void display()
	   {
		   System.out.println("This non static method");
		  System.out.println("student roll number is: "+rollNo);
		  System.out.println("*********************************************");
	   }
	 
	   
	   
	   
	   public   static void disp()
	   {
		   //System.out.println("name is:"+name);
		   System.out.println("this is static method");
		   System.out.println("rool no:"+rollNo);
	   }
	  
   }




public class Static_variableprog1 {

	public static void main(String[] args) {
	//	Scanner s=new Scanner(System.in);
		Stud ss=new Stud();
		System.out.println("enter student name:");
		//String name1=s.nextLine();
		
		ss.name="amol";
		//System.out.println("rollNo:"+rollNo);
		Stud.rollNo=56;
	
ss.display();
ss.disp();
	}

}
