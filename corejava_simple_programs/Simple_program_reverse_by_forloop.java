package corejava_simple_programs;

public class Simple_program_reverse_by_forloop {

	public static void main(String[] args) {
		System.out.println("The program of display given number in reverse order");
		System.out.println("");
		int no=4732;
		int rev_number=0;
		for(;no !=0;)
		{
		rev_number=rev_number*10;
			rev_number=rev_number+no%10;
			no=no/10;
		}
   System.out.println("The given number displayed in reverse order is:"+rev_number);
	System.out.println();
	System.out.println("***************************************");
	int n=9745;
	int rev_no=0;
	for(;n !=0;)
		{
		rev_no=rev_no*10;
		rev_no=rev_no+n%10;
		n=n/10;
		}
	System.out.println("The given float no displayed in reverse order is:"+rev_no);
	}

}
