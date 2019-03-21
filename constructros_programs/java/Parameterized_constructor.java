package constructros_programs.java;

public class Parameterized_constructor 
{
int empId;  
String empName;  
	
	public Parameterized_constructor(int id,String name) 
	{
		this.empId = id;  
	       this.empName = name;  
	       //ystem.out.println("empid:"+empId);
	       //System.out.println("name: "+empName);
	}
	void info(){
        System.out.println("Id: "+empId+" Name: "+empName);
   }  

	public static void main(String[] args) 
	{
		Parameterized_constructor p=new Parameterized_constructor(100, "Amol");
		Parameterized_constructor pp=new Parameterized_constructor(101,"Jyoti");
		//new Parameterized_constructor(102,"Mauli");
		p.info();
		pp.info();
		
		

	}

}
