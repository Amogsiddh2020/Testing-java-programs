package constructros_programs.java;

import java.util.Scanner;

public class Example3 {
	private int var;
    public Example3(int num)
    {
           var=num;
    }
    public int getValue()
    {
            return var;
    }

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number:");
		int var=s.nextInt();
		Example3 myobj = new Example3(var);
		System.out.println("var is: "+var);
       
		System.out.println("value of var is: "+myobj.getValue());// method calling with display value of var
	

	}

}
