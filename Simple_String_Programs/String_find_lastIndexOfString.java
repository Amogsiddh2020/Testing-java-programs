package Simple_String_Programs;

public class String_find_lastIndexOfString {

	public static void main(String[] args) {
		
		String s1 = "String Handling Functions";	 
	    System.out.println("Given String:" + s1 + "\n");
	 
	    String s2 = "i";
	    String s3 = "s";
	    System.out.println("Last Occurrence of" + " " + s2 + " " 
	     + "in the given string      is:" + s1.lastIndexOf(s2) + "\n");
	 
	    System.out.println("Last Occurrence of" + " " + s3 + " "
	 		     + "in the given string is:" + s1.lastIndexOf(s3));
	     String name="Maharasthra";
	     String lindex="t";
	     System.out.println("index of last character of t is: "+name.lastIndexOf(lindex));
	}

}
