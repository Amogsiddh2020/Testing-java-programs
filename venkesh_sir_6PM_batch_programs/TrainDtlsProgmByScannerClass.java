package venkesh_sir_6PM_batch_programs;

import java.util.Scanner;

class TrainDtls
{
	long trainNo;
	String trainName,to_Station,from_Station;
	
	  void getTrainDetails() 
	  {
		  System.out.println("train number is: "+trainNo);
		  System.out.println("train name is:"+trainName);
		  System.out.println("train starting of station: "+from_Station);
		  System.out.println("train Destination station is: "+to_Station);
		 }
	  }

public class TrainDtlsProgmByScannerClass {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
	   TrainDtls td=new TrainDtls();
	    System.out.println("enter the train number:");
	   td.trainNo=Long.parseLong(s.nextLine());
	   
	   System.out.println("enter the train name: ");
	   td.trainName=s.nextLine();
	   
	   System.out.println("enter the starting station name:");
	   td.from_Station=s.nextLine();
	   
	   System.out.println("enter the Destination station name:");
	   td.to_Station=s.nextLine();
	   
	   td.getTrainDetails();
		

	}

}
