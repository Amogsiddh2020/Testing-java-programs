package continue_stament_Programs;

public class SimpleProgram_Continue_statements {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++)
		{
			if(i==9)
			{
				continue;//used for skip of given condition://here i value 9 is skipped:
				//System.out.println(i);
			}
			System.out.println(i);
		}

	}

}
