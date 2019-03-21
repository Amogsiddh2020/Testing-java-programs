package com.static_variable_methods;

public class Static_variablepg {
     static int no;
     static String name;
    public void dis()
    {
    	System.out.println(name);
    	System.out.println(no);
    }
   static void disp()
    {
    	System.out.println(name);
    	System.out.println(no);
    	
    }
     
	public static void main(String[] args) {
		
		
		Static_variablepg s=new Static_variablepg();
		
		s.name="amol";
		
		Static_variablepg.no=56;
     s.dis();
     Static_variablepg.disp();
	}

}
