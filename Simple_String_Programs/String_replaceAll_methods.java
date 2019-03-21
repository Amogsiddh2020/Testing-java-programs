package Simple_String_Programs;

public class String_replaceAll_methods {

	public static void main(String[] args) {
		
		String s1="Object"+" "+"Oriented Programming Language";
		   System.out.println("Given string is:"+s1+"\n");
		 
		   String s2=s1.replaceAll("O","A"); 
		   System.out.println("After Replacement:"+s2+"\n");
		   
		   s2="Class,object,exception handling";
		   s2=s1.replaceAll(s1, s2);
		   System.out.println("The given String is : "+s1+"\n");
		   System.out.println("After replacing all new string is: "+s2+"\n");
		   
		   
		   s2="Data abstraction & encpasulation";
		   s2=s1.replaceAll("Object",s2);
		   System.out.println("The given string is :"+s1+"\n");
		   System.out.println("After the replaceAll string is :"+s2);
		   
		   
		   
	}

}
