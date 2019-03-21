package for_loops_programs.java;

public class TotalOddNumber_from1to100 {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 1;i <= 100;i++)
		{
			if(i % 2 != 0)
			{
				count++;
			}
		}
		System.out.println("The Count Of Odd Numbers are:" + count);

	}

}
