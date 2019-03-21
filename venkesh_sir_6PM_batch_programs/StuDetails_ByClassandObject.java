package venkesh_sir_6PM_batch_programs;


 class  StuDetails
 {
	 int rollNo;       //instance variable
	 String stuName,branchName;
	 
	 void getStuDetails()    //instance method
	 {
		 System.out.println("Student roll number is: "+rollNo);
		 System.out.println("Student name is: "+stuName);
		 System.out.println("Student Branch is: "+branchName+"\n");
		 
	 }
 }
          class StuContact
          {
        	  long pNo;      // instance variable
        	  String mailId;
        	  
        	  void getStuContact()    //instance method
        	  {
        		  System.out.println("student phone no is: "+pNo);
        		  System.out.println("student mail Id is: "+mailId+"\n");
        		  }
          }
          class StuAddress
          {
        	  String hNo,sName,city;    //instance variable
        	  long pinCode;
        	  void getStuAddress()     //instance method
        	  {
        		  System.out.println("student house no is: "+hNo);
        		  System.out.println("street name is:"+sName);
        		  System.out.println("city name is: "+city);
        		  System.out.println("pincode is: "+pinCode+"\n");
        	  }
          }

public class StuDetails_ByClassandObject {

	public static void main(String[] args) {  //static method
		StuDetails ad=new StuDetails();
		StuContact sc=new StuContact();
		StuAddress sa=new StuAddress();
		
		ad.rollNo=545;
		ad.stuName="Mahesh";
		ad.branchName="Mechanical Engineering";
		
		sc.pNo=7878454512L;         
		sc.mailId="mai@gamil.com";
		
		sa.hNo="456/h5/mahendra complex near to HDFC Bank";
		sa.sName="Kothurd chowk";   //non static variables assigning values by object
		sa.city="Pune";
		sa.pinCode=458596L;
		
		ad.getStuDetails();   // method calling using object
		sc.getStuContact();
		sa.getStuAddress();
		
	}

}
