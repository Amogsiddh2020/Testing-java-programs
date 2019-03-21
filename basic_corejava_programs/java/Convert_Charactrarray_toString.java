package basic_corejava_programs.java;

public class Convert_Charactrarray_toString {

	public static void main(String[] args) {
		char[] ch = {'a', 'e', 'i', 'o', 'u'};

        String st = String.valueOf(ch);
        String st2 = new String(ch);

        System.out.println(st);
        System.out.println(st2);
        System.out.println();
        System.out.println(" ");
        
        System.out.println("**************conver character array to string:*********** ");
        
      char[] name1= {'A','M','O','L'};
      String cc=String.valueOf(name1);
      String n=new String(name1);
      System.out.println("name: "+cc);
      System.out.println("name: "+n);
      
      
	}

}