package corejavaprograms.java;

public class Simple_program_add_with_object {
	int a,b,c;
	void add()
	{
		c=a+b;
		System.out.println("addition of a & b is:"+c);
	}

	public static void main(String[] args) 
	{
		Simple_program_add_with_object n=new Simple_program_add_with_object();
         n.a=123;//instance variable
         n.b=6;// instance variable
         n.add();//instance methods
		

	}

}
