package com.static_variable_methods;

public class Static_variableprogm2 {
	static int count=0;//will get memory only once and retain its value  
	  
	Static_variableprogm2()
	{
	count++;//incrementing the value of static variable  
	System.out.println(count);  
	}

	public static void main(String[] args) {
		//creating objects  
		Static_variableprogm2 s=new Static_variableprogm2();
		Static_variableprogm2 ss=new Static_variableprogm2();
		Static_variableprogm2 sss=new Static_variableprogm2();   
	
	}
	}