package venkesh_sir_6PM_batch_programs;

import java.util.Scanner;


public class ParameterizedMethodwithSwitchcase 
{
	class Addition1
	{
		public void add(int p,int q)
		{
			System.out.println("Addition: "+(p+q));
		}
	}
	class Subtraction
	{
		public void sub(int p,int q)
		{
			System.out.println("subtraction: "+(p-q));
		}
	}
	
	   class Multiplication
	   {
		  public  void mul(int p,int q)
		   {
			   System.out.println("multiplication: "+(p*q));
		   }
	   }
	   
	    class Division
	    {
	    	public void division(int p,int q)
	    	{
	    		System.out.println("Division: "+(p/q));
	    	}
	    }
	    
	      class ModDivision
	      {
	    	  public void modDivision(int p,int q)
	    	  {
	    		  System.out.println("Modulus Division:"+(p%q));
	    	  }
	      }

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter first integer value:");
		int v=Integer.parseInt(s.nextLine());
		System.out.println("enter second Integer Value:");
		int v1=Integer.parseInt(s.nextLine());
		
		System.out.println("************choice*************************");
		System.out.println("1.add\n2.sub\n3.multiplication\n4.division\5.modDivision");
		System.out.println("enter the your Choice:");
		int choice=Integer.parseInt(s.nextLine());
		
		
		/*switch(choice)
		{
		
		case 1 : 
			//Addition1 a1=new  Addition1();
			//a1.add(v,v1);
			break;
			
		case 2 :
			Subtraction su=new Subtraction();
			su.sub(v, v1);
			break;
			
		case 3 :
			Multiplication m=new Multiplication();
			m.mul(v, v1);
			break;
		case 4 :
			Division d=new Division();
			d.division(v, v1);
			break;
			
		case 5 :
			ModDivision md=new ModDivision();
			md.modDivision(v, v1);
			break;
			
			default:
				System.out.println("Invalid entered your choice:");
			
		
			
		}
*/
	}


}