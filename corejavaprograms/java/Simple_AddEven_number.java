package corejavaprograms.java;

public class Simple_AddEven_number {

	public static void main(String[] args) {
		System.out.println("Program of Display addition of even number from 1 to 50");
       System.out.println("");
       int sum=0;
       for(int i=0;i<=50;i++)
       {
    	   if(i % 2 == 0)
    	   {
    		   sum=sum+i;
    	   }
       }
       System.out.println("Sum of Even numbers from 1 to 50 is:"+sum);
	System.out.println();
	System.out.println("***************************************");
	System.out.println("program of Display sum of even numbers from 1 to 500");
	System.out.println();
	int sum1=0;
	for(int j=0;j<=500;j++)
	{
		if(j % 2 == 0)
		{
			sum1=sum1+j;
		}
	}
	System.out.println("Sum of Eeven numbers from 1 to 500 is:"+sum1);
	}
	}
