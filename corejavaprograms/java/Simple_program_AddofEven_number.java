package corejavaprograms.java;

public class Simple_program_AddofEven_number {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<=100;i++)
		{
			if(i % 2 == 0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Addition of Even numbers from 1 to 100 number is:"+sum);

	}

}
