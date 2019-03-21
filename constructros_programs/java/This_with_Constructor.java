package constructros_programs.java;

public class This_with_Constructor 
{
	int var;
      
	  public This_with_Constructor() 
	  {
		  this.var=80;
	}
	  
	  This_with_Constructor(int no)
	  {
		  this.var=no;
	  }
	  public int getvalue()
	  {
		  return var;
	  }
	public static void main(String[] args) 
	{
		This_with_Constructor tc=new This_with_Constructor();
		This_with_Constructor tcp=new This_with_Constructor(72);
		
		System.out.println("var is: "+tc.getvalue());
		System.out.println("var1 is: "+tcp.getvalue());
	

	}

}
