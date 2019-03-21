package for_loops_programs.java;

public class SumOfOddnumber_from1To100 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) 
		{
			if (i % 2 != 0) 
			{
				sum = sum + i;
			}
		}
		System.out.println("The Sum Of odd  Numbers from 1 to 100:" + sum);

	}

}
