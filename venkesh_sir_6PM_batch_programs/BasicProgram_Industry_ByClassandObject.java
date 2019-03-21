package venkesh_sir_6PM_batch_programs;

class IndustryLocation
{
	
	String indType,indusLocation,indusAddr;     //instance variables
	
	void getIndustryLOcation() // instance methods
	{
		System.out.println("industry type is: "+indType+"\n");
		System.out.println("industry location is: "+indusLocation+"\n");
		System.out.println("industry address is: "+indusAddr);
	}
	}

public class BasicProgram_Industry_ByClassandObject {

	public static void main(String[] args)  //static method
	{
		//BasicProgram_Industry_ByClassandObject ic=new BasicProgram_Industry_ByClassandObject();
		
		IndustryLocation ic=new IndustryLocation();
		ic.indType="SMALl SCALE";     //assigning values for instance variables by obejct
		ic.indusLocation="Bangalore";
		ic.indusAddr="12/Ashoka Plazza,S R Nagar,near IT Tower,Near jama compplex";
		
		ic.getIndustryLOcation();  //method calling by object
	

	}

}
