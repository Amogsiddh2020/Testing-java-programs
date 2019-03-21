package corejava_simple_programs;

public class Basic_progarm {
int a,b;
void add()
{
	int c=a+b;
	System.out.println("addition of a & b is:"+c);
	}
	public static void main(String[] args) 
	{
		Basic_progarm ob=new Basic_progarm();
		ob.a=123; //instance variable
		ob.b=11;  //instance variable
		ob.add();  ///instance method
		

	}

}
