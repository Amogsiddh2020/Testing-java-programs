package Simple_String_Programs;

public class String_replaceMethod_with_character {

	public static void main(String[] args) {
		// public static void main(String args[]) 
		    
		      String s1="String Handling Functions";
		      System.out.println("String:"+s1+"\n");
		 
		      String s2=s1.replace('i','l'); 
		      System.out.println("Replaced String is:"+s2+"\n");
		      
		      
		      String name="Amol",n;
		      n=name.replace('A','a');
		      System.out.println("name is: "+name+"\n");
		      System.out.println("New name is: "+n+"\n");
		        
		      String statename="jay Marasthara",s;
		      s=statename.replace('j','J');
		      System.out.println("statename is: "+statename+"\n");
		      System.out.println("new repalced value is: "+s+"\n");
		      
		      s=statename.replace('r','R');
		      System.out.println("new after replacing statename is: "+s+"\n");
		      
		      
		      String d="Pandharpur,solapur,mandrup",c;
		      c=d.replace('p','P');
		      System.out.println("city names are: "+d+"\n");
		      System.out.println("after replacing city names are: "+c+"\n");
		      
		      
		      c=d.replace('r','&');
		      System.out.println("given city names are: "+d+"\n");
		      System.out.println("after replacing the city names are: "+c);
		      
		      
		      
		      
		      
		      

	}

}
