package basic_corejava_programs.java;

public class Covert_charactr_TO_String {

	public static void main(String[] args) {
		char ch = 'c';
        String st = Character.toString(ch);
        // Alternatively
        // st = String.valueOf(ch);

        System.out.println("The string is: " + st);

	}

}
