package Simple_String_Programs;

public class Index_of_single_Character {

	public static void main(String[] args) {
		
		String s="I LIKE CHOCOLATE";
	     int i=s.indexOf('O');
	     int j=s.lastIndexOf('O');
	 
	     System.out.println("The Index value for the first occurrence for character O is:" +i);
	     System.out.println("The Index value for the Last occurrence for character O is:" +j);
	     
	     
	     System.out.println("");
	     System.out.println("**************************************************");
	     String cityname="Solapur";
	     String city="solapur";
	    
	     int p=cityname.indexOf('S');
	     System.out.println("The index value of first occurence of charactre is: "+p);
	     System.out.println("");
	      
	     int q=city.lastIndexOf('s');
	     System.out.println("index value of last occurence of character is: "+q+"\n");
	     System.out.println("program not present character in given string"+"\n");
	     
	     String name="Amol Deshmukh";
	     int g=name.indexOf('e');
	     System.out.println("index value of first occurence of space is: "+g+"\n");
	     
	    String address="At post ameerpeth,Hyederabad,Telagana";
	    int ad=address.indexOf('A');
	    System.out.println("index value of first occurence of character A is:"+ad+"\n");
        
	    ad=address.lastIndexOf('a');
	    System.out.println("index value of Last occurence of character a is : "+ad+"\n");
	    
	    ad=address.indexOf(',');
	    System.out.println("index value of first occurence of character  , is :"+ad+"\n");
	    
	    ad=address.lastIndexOf(',');
	    System.out.println("index value of last occurence of character , is: "+ad);
	
	}

}
