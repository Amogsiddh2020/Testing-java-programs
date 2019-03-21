package constructros_programs.java;

public class Parameterized_Constructor_withobject 
{
	String city;
	long m_number;
	public Parameterized_Constructor_withobject() //zero parameter constructor
	{
		System.out.println(" zero parameter / without parameter construcor ");
	}
  
	public Parameterized_Constructor_withobject(String city,long m_number) //parameterized constructor
	{
		this.city=city;
	this.m_number=m_number;
		System.out.println("city name & mobile number is: "+city+" \n "+m_number);
	
	}
	public static void main(String[] args) 
	{
		Parameterized_Constructor_withobject p=new Parameterized_Constructor_withobject();
		Parameterized_Constructor_withobject pct=new Parameterized_Constructor_withobject("Mandrup",8007636630L);
		

	}

}
