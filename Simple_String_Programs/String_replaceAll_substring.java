package Simple_String_Programs;

public class String_replaceAll_substring {

	public static void main(String[] args) {
	String address="neharu chowk mandrup,Tal:south solapur,Dis:solapur,state:Mahrasthra";
     System.out.println("Program to display the replacing the substring in given strin"+"\n");
     System.out.println("Address is: "+address+"\n");
     String sub="At psot";
     sub=address.replaceAll("neharu chowk",sub);
     System.out.println("After replacing substring the new address is: "+sub+"\n");
     
     
     String sub1="House no 0127,nearu chowk,near Jamadar hospital";
     sub1=address.replaceAll("neharu chowk",sub1);
     System.out.println("The given address is: "+address+"\n");
     System.out.println("After the replaceAll the subtring in given string:"+sub1+"\n");
     
     
     String sub2="Landmark->Main road of highway ";
     sub2=address.replaceAll("mandrup",sub2);
     System.out.println("The given address is the:"+address+"\n");
     System.out.println("After replacing the sub string in given string is:"+sub2);
	}

}
