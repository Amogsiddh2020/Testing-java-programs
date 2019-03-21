package simplecorejava_programs.java;

public class Count_digitIngiven_number {

	public static void main(String[] args) {
		int count = 0; 
		long num = 80076366307875L;

        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);

	}

}
