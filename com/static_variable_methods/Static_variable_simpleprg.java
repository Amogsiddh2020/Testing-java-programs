package com.static_variable_methods;
   class Student11
   {
   static int rollno;
	   static int rollNo1;
	  static String name;
	   
	   public void display()
	   {
		   System.out.println("***************display()*********************");
		   System.out.println(rollno);
		   System.out.println("roll no:"+rollNo1);
		   System.out.println("name:"+name);
		   
	     }
   static void disp()
   {
	   System.out.println("*************disp()*********************");
	   System.out.println("rollno:"+rollno);
	   System.out.println("rollno:"+rollNo1);
	   System.out.println("name:"+name);
   }
	   
   }
   
   
   
public class Static_variable_simpleprg {

	public static void main(String[] args) {
		
 Student11 s=new Student11();
 s.rollno=78;
 Student11.rollNo1=56;
 Student11.name="Amogsiddha Deshmukh";
 s.display();
 Student11.disp();
 
 
 //Student11.name="Amol";
 
	}

}
