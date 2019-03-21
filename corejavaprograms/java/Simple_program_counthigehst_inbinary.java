package corejavaprograms.java;

public class Simple_program_counthigehst_inbinary {

	public static void main(String[] args) {
		int value = 10;
		// Get the binary equivalent
		System.out.println("Binary equivalent:"+Integer.toBinaryString(value));
		// get the integer equivalent of the lowest one's bit
		System.out.println("Lowest one's bit equivalent:"+Integer.lowestOneBit(value));
  System.out.println("");
  System.out.println();
  int val = 17;
	// Get the binary equivalent
	System.out.println("Binary equivalent:"+Integer.toBinaryString(val));
	// get the integer equivalent of the lowest one's bit
	System.out.println("Lowest one's bit equivalent:"+Integer.lowestOneBit(val));
	}

}
