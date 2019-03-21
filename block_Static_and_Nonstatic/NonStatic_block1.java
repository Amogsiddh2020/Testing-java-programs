package block_Static_and_Nonstatic;

    class Emp1
    {
    	{
    	int a=5,b=9;
    	System.out.println("This is non static block:");
    	System.out.println("Emp name is:Amul");
    	System.out.println("Emp age is:"+(a*b));
    	System.out.println("***********************************************");
    	System.out.println();
    	System.out.println();
    	}
    	
    	{
    		int i=7,j=8;
    		System.out.println("This is second non static block");
    		System.out.println("Addition of a & b is: "+(i+j));
    		System.out.println("Subtraction of two number is: "+(i-j));
    		System.out.println("*****************************************");
    		System.out.println();
    		System.out.println();
    		System.out.println();
    	}
    	
    	{
    		System.out.println("This is third non static block:");
    		System.out.println("Welcome to Solapur:");
    		System.out.println("*******************************************");
    	}
    
    }

public class NonStatic_block1 {

	public static void main(String[] args) {
		Emp1 e=new Emp1();
		Emp1 ee=new Emp1();
		Emp1 e1=new Emp1();
		

	}

}
