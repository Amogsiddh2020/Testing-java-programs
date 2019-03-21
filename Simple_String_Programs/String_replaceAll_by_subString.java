package Simple_String_Programs;

public class String_replaceAll_by_subString {

	public static void main(String[] args) {
	String st="Welcom to liveTech   ",stt="    Hyderabad";
	st=st.replaceAll("   ",stt);
	System.out.println("The given string is :"+st+"\n");
	
	String s="Ameerpeth";
	
	System.out.println("The given string is: "+stt+"\n");
	stt=stt.replaceAll("    ",s);
	System.out.println("After replacing by substring in given string is :"+stt);
	
	

	}

}
