package switchcase.java;

public class Switchcase_prog1 {

	public static void main(String[] args) {
		System.out.println("**************************Without break statements**************************");
		int i=1;
		
	      switch(i)
	      {
		 case 1:
		   System.out.println("Case1 ");
		 case 2:
		   System.out.println("Case2 ");
		 case 3:
		   System.out.println("Case3 ");
		 case 4:
	           System.out.println("Case4 ");
		 default:
		   System.out.println("Default ");
	      }
	      
	      
	      System.out.println("***************With Break Statments******************************");
	      int j=2;
	      switch(i)
	      {
		 case 1:
		   System.out.println("Case1 ");
		   break;
		 case 2:
		   System.out.println("Case2 ");
		   break;
		 case 3:
		   System.out.println("Case3 ");
		   break;
		 case 4:
	           System.out.println("Case4 ");
              break;
              default:
		   System.out.println("Default ");
	      }

	}

}
