package Simple_String_Programs;

public class Compare_withIgnoreCase {

	public static void main(String[] args) {
		String s1 = "APPLE";
	     String s2 = "A";
	     String s3 = "APPLE";
	     String s4="amol",s="aMol";
	 
	     int k = s1.compareToIgnoreCase( s2 );
	     System.out.println(k);
	 
	     k = s2.compareToIgnoreCase( s3 );
	     System.out.println(k);
	 
	     k = s3.compareToIgnoreCase( s1 );
	     System.out.println(k);
	     k=s4.compareToIgnoreCase(s);
	     System.out.println(k);
	    }
	}
