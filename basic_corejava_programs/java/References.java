package basic_corejava_programs.java;

import java.util.Scanner;

class Balance
    {
    	double bal=2000;
    	
    	void getBal()
    	{
    		System.out.println("Balance is: "+bal);
    	}
    }
     


    class WithDraw
      {
    	  Balance b1;
    	 
    	  WithDraw(Balance b1) 
    	  {
    		  this.b1=b1;
			}
    	  void withDraw(int amt)
    	  {
    		  if(amt<=b1.bal)
    		  {
    			  System.out.println("amount withdraw: "+amt);
    		  b1.bal=b1.bal-amt;
    		  b1.getBal();
    		  System.out.println("Trasction is completed:");
    		  }
    		  else
    		  {
    			  System.out.println("insufficient fund:");
    		  }
    	  }      }
     
public class References 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Balance b1=new Balance();
		WithDraw wd=new WithDraw(b1);
		
		System.out.println("enter the amount: ");
		int amt=Integer.parseInt(s.nextLine());
if(amt>0 && amt%100==0)
{
	wd.withDraw(amt);
	}
else
{
	System.out.println("invalid amount:");
	}
	}

}
