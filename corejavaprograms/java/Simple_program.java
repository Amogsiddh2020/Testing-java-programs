package corejavaprograms.java;

public class Simple_program {
	int i=10;
	//System.out.print("hello:");
	void display()
	{
		int s=100;
		System.out.println("value of s is:"+s);
		System.out.println();
		System.out.println("value of i is:"+i);
	}

	public static void main(String[] args) {
		int a=1234;
		System.out.println("value of a is:"+a);
		System.out.println("static members");
		
		Simple_program p=new Simple_program();
		p.display();
	}

}
