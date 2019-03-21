package venkesh_sir_6PM_batch_programs;

import java.util.Scanner;

public class SimpleSwitchcaseprogm4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int choice;
		System.out.println("enter the your choice");
		choice=Integer.parseInt(s.nextLine());
		
		switch(choice)
		{
		case 1:
			System.out.println("1995:");
			break;
			
		case 2:
			System.out.println("1997:");
			break;
			
		case 3:
			System.out.println("1999:");
			break;
			
		case 4:
			System.out.println("2002:");
			break;
			
		case 5:
			System.out.println("2010:");
			break;
			
			default:
				System.out.println("Invalid choice");
				//break;
			
		}
		

	}

}
