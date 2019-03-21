package simplecorejava_programs.java;

public class Character_displaysequence {

	public static void main(String[] args) {
		char c;

        for(c = 'A'; c <= 'Z'; ++c)
            System.out.print(c + " ");
        System.out.println("");
        
        System.out.println("************************************");
        for(c = 'a'; c <= 'z'; ++c)
            System.out.print(c + " ");

System.out.println("");
System.out.println("*******************************************");
for(c = 'A'; c <= 'Z'; c++)
    System.out.print(c + " ");

	}

}
