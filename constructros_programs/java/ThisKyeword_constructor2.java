package constructros_programs.java;

public class ThisKyeword_constructor2 {
	int empId;  
	   String empName;  
		    
	   //parameterized constructor with two parameters
	   ThisKyeword_constructor2(int id, String name){  
	      this.empId = id;  
	      this.empName = name;  
	   }  
	   void info(){
	        System.out.println("Id: "+empId+" Name: "+empName);
	   }  

	public static void main(String[] args) {
		ThisKyeword_constructor2 obj1 = new ThisKyeword_constructor2(10245,"Chaitanya");  
		ThisKyeword_constructor2 obj2  = new ThisKyeword_constructor2(92232,"Negan");  
		obj1.info();  
		obj2.info(); 

	}

}
