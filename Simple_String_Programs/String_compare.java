package Simple_String_Programs;

public class String_compare {

	public static void main(String[] args) {
		 String str1 = "String number one";
	       String str2 = "String one";
	       String str3 = "String number two";
	       int v1 = str1.compareTo( str2 );
	       System.out.println("str1 & str2 comparison: "+v1);
	       int v2 = str1.compareTo( str3 );
	       System.out.println("str1 & str3 comparison: "+v2);
	       int v3 = str2.compareTo("String one");
	       System.out.println("str2 & string argument comparison: "+v3);
	       String name="amol";
	       int v4=name.compareTo("Amol");
	       System.out.println("string compare of name is: "+v4);

	}

}
