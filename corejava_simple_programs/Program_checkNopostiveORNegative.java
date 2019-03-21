package corejava_simple_programs;

import java.util.Scanner;

public class Program_checkNopostiveORNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		if(no>0)
		{
			System.out.println(no+":"+"Entered number is positive");
		}
		else if(no<0)
		{
			System.out.println(no+":"+"Entered number is negative");
		}
		else
		{
			System.out.println(no+":"+"Entered number either positive neither negative ");
		}

	}

}
