package Simple_String_Programs;

public class String_getHashcode {

	public static void main(String[] args) {
		
		String s= "Srilekha"; 
				  Integer i=15; 
				  Float f=12.0f;
				 
				  System.out.println("String value:" +s); 
				  System.out.println("Integer value:" +i); 
				  System.out.println("Float value:" +f);
				 
				  Integer hashcode=s.hashCode(); 
				  Integer hash1=i.hashCode(); 
				  Integer hash2=f.hashCode();
				 
				  System.out.println("Hash code for the string:" +hashcode); 
				  System.out.println("");
				  System.out.println("Hash code for integer value:" +hash1);
				  System.out.println("");
				  System.out.println("Hash code for the float value:"+hash2); 
				  System.out.println("");
				  
				  String cityname="Maharasthra";
				  Integer pincode=413221;
				  Integer hash=cityname.hashCode();
				  Integer h1=pincode.hashCode();
				  System.out.println("hashcode of cityname is: "+hash);
				  System.out.println("");
				  System.out.println("hashcode of pincode is: "+h1);
	}

}
