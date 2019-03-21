package switchcase.java;

import java.util.Scanner;

public class Addtwo_no {
	//int a,b,sum,sub,mul;

	public static void main(String[] args) {
		int a,b,sum,sub,mul;
		Scanner s=new Scanner(System.in);
		
		
			
		System.out.println("enter value of a:");
		a=Integer.parseInt(s.nextLine());

		System.out.println("enter value of b:");
	    b=Integer.parseInt(s.nextLine());
	    
	    System.out.println("enter your choice:");
        int c=Integer.parseInt(s.nextLine());

		
		
		switch(c)
		{
		case 1:
			//int a,b,sum;
			
			sum=a+b;
			System.out.println("sum:"+sum);
			break;
		case 2:
			//int p,q,sub;
			sub=a-b;
			System.out.println("subtraction: "+sub);
			break;
		case 3:
			//int e,d,mul;
			mul=a*b;
			System.out.println("multiplication: "+mul);
			break;
			
			default:
				System.out.println("invalid choice:");
				break;
			}
		}
	}
