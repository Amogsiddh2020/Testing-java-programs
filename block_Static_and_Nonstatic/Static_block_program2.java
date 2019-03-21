package block_Static_and_Nonstatic;
    class Addition 
    {
    	static //static block executed only once when class is loaded on to method area:
    	{
    		int a=10,b=52;  
    	  System.out.println("Static block of addition:");	
    		System.out.println("Addition of a & b is: "+(a+b));
    		System.out.println("******************************");
    		System.out.println("Mutliplication two numbers:");
    		System.out.println("Multiplication of a & b is:"+(a*b));
    	}
    }
public class Static_block_program2 {

	public static void main(String[] args) {
		Addition a=new Addition();
		Addition aa=new Addition();
	}
	}
