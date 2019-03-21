package continue_stament_Programs;

public class While_with_Continue_Statements {

	public static void main(String[] args) {
		int counter=10;
		while (counter >=0)
		{
	           if (counter==7)
	           {
		       counter--;
		       continue;
	           }
	           System.out.print(counter+" ");
	           counter--;
		}

	}

}
