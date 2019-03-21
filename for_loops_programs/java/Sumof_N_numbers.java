package for_loops_programs.java;

public class Sumof_N_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int n=10;
		for(int i = 1;i <= n;i++)
		{
			sum = sum + i;
		}
		System.out.println("The Sum Of "+n+" Numbers are:" + sum);

	}

}
