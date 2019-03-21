package corejava_simple_programs;

public class Simple_program_find_grater_by_ternaryOPrator {

	public static void main(String[] args) {
		int num1=121,num2=45,num3=91,temp,result;
		 temp = num1>num2 ? num1:num2;
	        result = num3>temp ? num3:temp;
	        System.out.println("Largest Number is:"+result);

	}

}
