package com.static_variable_methods;
class Student{  
	   int rollno;//instance variable  
	   String name;  
	   static String college ="ITS";//static variable  
	   //constructor  
	   Student(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   //method to display the values 
	public    static void display1()
	   {
		   System.out.println("college name: "+college);
		   
	   }
	   void display ()
	   {
		   System.out.println(rollno+" "+name+" "+college);
		   System.out.println("college name:"+college);
		   System.out.println("**********************************");} 
	}  
public class Static_variable_firstProg1 {

	public static void main(String[] args) {
		Student s1 = new Student(111,"Karan");  
		 Student s2 = new Student(222,"Aryan");  
		 //we can change the college of all objects by the single line of code  
		 //Student.college="BBDIT";  
		 s1.display();  
		 s2.display(); 
		 Student.college="AGPPI,solapur";
		 Student.display1();
	

	}

}
