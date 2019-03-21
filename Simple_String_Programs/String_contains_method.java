package Simple_String_Programs;

public class String_contains_method {

	public static void main(String[] args) {
	
		   String s1 = "saddle";
           String s2 = "adverse"; 
           String s3 ="ad";
           String s="Amol",s4="A mol";    // spaces are not considered in contains():

           System.out.println(s1.contains(s2));
           System.out.println();
           System.out.println(s2.contains(s3));
           System.out.println("");
           System.out.println(s3.contains(s1));
           System.out.println();
           System.out.println(s.contains(s4));
	}

}
