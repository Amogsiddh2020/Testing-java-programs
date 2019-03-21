package block_Static_and_Nonstatic;

   class Display
   {
	   {    // non static blocks are executed creation of  multiples of objects of class 
		   System.out.println("Hello,Welcome to Mandrup:");
		   System.out.println("Welcome to Selenium Automation Testing:");
		   System.out.println();
		   System.out.println();
	   }
   }
public class NonStatic_blockSimpleProgm {

	public static void main(String[] args) {
		Display d=new Display();
		Display dd=new Display();
		Display d1=new Display();
		Display s=new Display();

	}

}
