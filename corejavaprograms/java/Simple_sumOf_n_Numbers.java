package corejavaprograms.java;

public class Simple_sumOf_n_Numbers {

	public static void main(String[] args) 
	{
		int sum = 0;
		int n=10;
		for(int i = 1;i <= n;i++)
		{
			sum = sum + i;
		}
		System.out.println("The Sum Of "+n+" Numbers are:" + sum);
		System.out.println("");
		System.out.println("******************************************");
		System.out.println("The program is Display of sum of N numbers :");
		System.out.println(" ");
		int sum1=0,N=20;
		for(int j=0;j<N;j++)
		{
			sum1=sum1+j;
		}
		System.out.println("The Sum of "+N+" Numbers: "+sum1);

	}

}
