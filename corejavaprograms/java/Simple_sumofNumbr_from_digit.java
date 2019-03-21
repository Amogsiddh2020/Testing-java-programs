package corejavaprograms.java;

public class Simple_sumofNumbr_from_digit {

	public static void main(String[] args) {
		System.out.println("Display the program of sume given numbers of digits");
		int num=251025, rem = 0, sum = 0, temp;
		temp = num;
 
		while (num > 0)
		{
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
 
		System.out.print("Sum of Digits of " + temp + " is: " + sum);
  System.out.println();
  System.out.println("***************************************");
  int n=897763,re=0,s=0,temP;
  temP=n;
  while(n>0)
  {
	  re=n%10;
	  s=s+re;
	  n=n/10;
  }
  System.out.println("Sum of digits of "+temP+" is:"+s );
	}

}
