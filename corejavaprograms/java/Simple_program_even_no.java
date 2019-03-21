package corejavaprograms.java;

public class Simple_program_even_no {

	public static void main(String[] args) 
	{
	System.out.println("Display odd numbers from 1 to 100");
	System.out.println();
		System.out.println("The Odd Numbers are:");
		for (int i = 1; i <= 100; i++) 
		{
			if (i % 2 != 0) 
			{
				System.out.println(i + " ");
			}
		}

	}

}
