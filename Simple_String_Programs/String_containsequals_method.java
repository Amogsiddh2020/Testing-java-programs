package Simple_String_Programs;

public class String_containsequals_method {

	public static void main(String[] args) {
		 String s1 = "happy"; 
         String s2 = "34"; 
         String s3 ="sad";

         System.out.println( s1.contentEquals ("happy"));
         System.out.println();
         
         System.out.println ( s1.contentEquals(s2));
         System.out.println();
         
         System.out.println( s2.contentEquals("34"));
         System.out.println();
         
         System.out.println(s1.contentEquals("happy"));
         System.out.println();
         
         System.out.println(s2.contentEquals("34 "));  //  Backward spaces are not accepted
         System.out.println();
         
         System.out.println(s2.contentEquals(" 34")); // forward spaces are not accepted:
         System.out.println();
         
         System.out.println(s2.contentEquals("3 4"));  // in between string is spaces are not accepted
         System.out.println();
         System.out.println(s2.contentEquals("34"));

	}

}
