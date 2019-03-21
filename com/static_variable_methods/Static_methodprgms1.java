package com.static_variable_methods;
class Baseclass
{
	int rollno;  
    String name;  
    static String college = "ITS";  
    //static method to change the value of static variable  
    static void change(){  
    college = "BBDIT";  
      
    }  
    //constructor to initialize the variable  
    Baseclass(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display values  
    void display(){System.out.println(rollno+" "+name+" "+college);} 
}

public class Static_methodprgms1 {

	public static void main(String[] args) 
	{
		Baseclass.change();//calling change method  
	    //creating objects  
	    Baseclass s1 = new Baseclass(111,"Karan");  
	    Baseclass s2 = new Baseclass(222,"Aryan");  
	    Baseclass s3 = new Baseclass(333,"Sonoo");  
	    //calling display method  
	    s1.display();  
	    s2.display();  
	    s3.display();  
		
		

	}

}
