package block_Static_and_Nonstatic;


    class Emp
    {
    	static    //static blocks executed only once:
    	{
    		System.out.println("Hello welcome to Hyderabad:");
    		System.out.println("Core java by Venktesh sir:");
    		System.out.println("Welcome to Maharasthra:");
    		
    	}
    }

public class Static_Blocks {

	public static void main(String[] args) {
		Emp e=new Emp();
		Emp ee=new Emp();
		}

}
