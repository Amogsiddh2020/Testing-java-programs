package corejava_simple_programs;

public class Simple_program_Reverse_givenNo {

	public static void main(String[] args) {
		int num=12345;
	      int reversenum =0;
	      System.out.println("The program to Display given number in reverse order: ");
	      //This statement will capture the user input
	      //While Loop: Logic to find out the reverse number
	      while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }

	      System.out.println("Reverse of input number is: "+reversenum);
	      System.out.println("");
	      System.out.println("**************************************");
	      System.out.println("prgram of Display the given number in reverse order:");
         int n=5127;
         int rev_number=0;
         while(n!=0)
         {
        	 rev_number=rev_number*10;
        	 rev_number=rev_number+n%10;
        	 n=n/10;
        	}
         System.out.println("The given number in reverse order is:"+rev_number);
	}

}
