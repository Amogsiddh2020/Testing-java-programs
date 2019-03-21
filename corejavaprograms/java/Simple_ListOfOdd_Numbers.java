package corejavaprograms.java;

public class Simple_ListOfOdd_Numbers {

	public static void main(String[] args) 
	{
		int count = 0;
		for(int i = 1;i <= 100;i++)
		{
			if(i % 2 != 0)
			{
				count++;
			}
		}
		System.out.println("The sum  Of Odd Numbers from 1 to 50 are:" + count);
		System.out.println("");
		System.out.println("******************************************");
       int total=0;
       for(int j=0;j<=200;j++)
       {
    	   if(j % 2 !=0)
    	   {
    		   total++;
    	   }
       }
       System.out.println();
	System.out.println("Sum Odd Numbers from 1 to 200 are:"+total);
	}

}
