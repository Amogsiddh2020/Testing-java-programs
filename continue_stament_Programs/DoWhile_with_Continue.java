package continue_stament_Programs;

public class DoWhile_with_Continue {

	public static void main(String[] args) {
		int j=0;
        do
	{
	   if (j==7)
	   {
		 j++;
		 continue;
	   }
	   System.out.print(j+ " ");
	   j++;
       }while(j<10);

	}

}
