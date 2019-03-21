package Simple_String_Programs;

public class Indexposition_ofString {

	public static void main(String[] args) {
		String s1="Java developed by james Gosling";;
	    String s2="Angry Birds game is very nice";
	 
	    int i1=s1.indexOf("james");
	    System.out.println("Index value for the substring i1:" +i1);
	 
	    int i2=s2.indexOf("good");
	    System.out.println("Index for the substring i2:" +i2);
	 
	    int i3=s2.indexOf("Birds");
	    System.out.println("Index for the substring i3:" +i3); 
	    System.out.println("");
	    String i4="amol";
	    int s=i4.indexOf("m");
	    System.out.println("index for the substring i4 is: "+s);
	    System.out.println("");
	    String s5="Solapur Maharasthra,India";
         int i5=s5.indexOf("rasthra");
         System.out.println("index for the sub string i5 is: "+i5);
	}

}
