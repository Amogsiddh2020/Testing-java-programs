package Simple_String_Programs;

public class program_removingAll_Whitespaces {

	public static void main(String[] args) {
		 String str1="Remove white spaces";    
         System.out.println("given string with all white spaces: "+str1);  
         System.out.println("");
	        //Removes the white spaces using regex    
	        str1 = str1.replaceAll("\\s+", "");    
	            
	        System.out.println("String after removing all the white spaces : " + str1); 
      System.out.println("*******************************");
      String s1="Jay Maharasthra To Hindu ";
      System.out.println("Given string is: "+s1);
      System.out.println("");
      s1=s1.replaceAll("\\s+", "");
      System.out.println("Given string without white space is:"+s1);
	}

}
