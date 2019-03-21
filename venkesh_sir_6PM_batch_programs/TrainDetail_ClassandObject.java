package venkesh_sir_6PM_batch_programs;

class TrainDetails
{
	long trainNo;   //instance variables
	String trainName,from_Station,to_station;
	
	void getTrainDetails()    //instance method
	{
		System.out.println("Train Number is: "+trainNo+"\n");
		System.out.println("Train name is: "+trainName+"\n");
		System.out.println("Train from Station name is: "+from_Station+"\n");
		System.out.println("Train To Destination station: "+to_station);
	}
}
public class TrainDetail_ClassandObject {

	public static void main(String[] args)   //static method
	{
		TrainDetails td=new TrainDetails();
		
		td.trainNo=785641365;        //assigning values to instance variables by using object of class
		td.trainName="Udhyan Express";
		td.from_Station="Solapur";
		td.to_station="Pune";
		
		td.getTrainDetails();  //method calling by using object
		

	}

}
