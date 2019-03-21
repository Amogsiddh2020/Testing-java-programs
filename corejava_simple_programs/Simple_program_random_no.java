package corejava_simple_programs;

import java.util.Random;

public class Simple_program_random_no {

	public static void main(String[] args) {
		
		 int counter;
	      Random rnum = new Random();
	      /* Below code would generate 5 random numbers
	       * between 0 and 200.
	       */
	      System.out.println("Display five random numbers between 1 to 200");
	      System.out.println("Random Numbers:");
	      System.out.println("***************");
	      for (counter = 1; counter <= 5; counter++) 
	      {
	         System.out.println(rnum.nextInt(200));
	      }
	      int count1;
	      System.out.println("");
	      System.out.println("*****************************************");
	      System.out.println("Display five float random numbers:");
	      System.out.println("Five random float numbers are:");
	      System.out.println();
	for(count1=1;count1<=5;count1++)
	{
		System.out.println(rnum.nextFloat());
	}
	int c;
	System.out.println("");
	System.out.println("*******************************");
	System.out.println("Display five double random numbers ");
	System.out.println("Five Double random numbers are ");
System.out.println("");
for(c=1;c<=5;c++)
	{
		System.out.println(rnum.nextDouble());
	}
	}

}
