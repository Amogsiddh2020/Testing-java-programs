package corejavaprograms.java;

public class Simple_program_of_Palindrome {

	public static void main(String[] args) {
	System.out.println("Palindrome progarm:");
	System.out.println();
	 int r,sum=0,temp;    
	  int n=454;
	  //int r1=0,sum1=0,temP;
	  //int no=234;
	  //It is the number variable to be checked for palindrome  
	  
	  temp=n;    
	  while(n>0){    
	   r=n%10;  //getting remainder  
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
	  if(temp==sum)    
	   System.out.println(temp+":"+"The given number is palindrome  ");    
	  else    
	   System.out.println(temp+":"+"The given number is not palindrome"); 
System.out.println("");
System.out.println();
System.out.println("Program for Palindrome-Two");
System.out.println();
int r1,sum1=0,temP;
int no=181;

temP=no;
while(no>0)
{
	r1=no%10;
sum1=(sum1*10)+r1;
no=no/10;
}
if(temP==sum1)

	System.out.println(temP+":"+"given no is palindrome");
	
else
	
	System.out.println(temP+":"+"given no is not palindrome");

	
}
}