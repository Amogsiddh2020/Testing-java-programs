package venkesh_sir_6PM_batch_programs;

class EmpDetails
{
	String empId,empName,eDesg;  //instance variables
	void getEmpDetails()       //instance methods
	{
		System.out.println("EmpId: "+empId);
		System.out.println("EmpName: "+empName);
		System.out.println("EmpDesgnition: "+eDesg+"\n");
	}
	
}
	
	class EmpContact
	{
		long pNo;
		String mailId;      //instance variables
		
		void getEmpContact()    //instance methods
		{
			System.out.println("EmpPhoneNo: "+pNo);
			System.out.println("EmpMailId: "+mailId+"\n");
		}
	}
	    class EmpAddress
	    {
	    	String hNo,sName,city;
	    	long pinCode;
	    	
	    	void getEmpAddress()
	    	{
	    		System.out.println("EmpHoseNo: "+hNo);
	    		System.out.println("EmpStreetName: "+sName);
	    		System.out.println("EmpCity: "+city);
	    		System.out.println("PinCode: "+pinCode);
	    	}
	    }
	


public class Simple_ProgramOf_ClassandObject {

	public static void main(String[] args)        //static method
	{
		
		EmpDetails ed=new EmpDetails();       //object creation 
		
		EmpContact ec=new EmpContact();
		
		EmpAddress ea=new EmpAddress();
		
		ed.empId="SD128";                 //using object assigning values to nonstatic 
		ed.empName="Amol Deshmukh";     // variables
		ed.eDesg="Software Testing";
		
		ec.pNo=8756897412L;
		ec.mailId="a1@gamil.com";
		
		ea.hNo="167S/Jayarm";
		ea.sName="S R Nagar";
		ea.city="Hyderabad";
		ea.pinCode=413221L;
		
		ed.getEmpDetails();       // using object method calling
		ec.getEmpContact();
		ea.getEmpAddress();

	}

}
