package corejavaprograms.java;

public class Simple_prog_int_to_binary_hi_bit_count {

	public static void main(String[] args) {
		int value = 178;
		// Get the binary equivalent
		System.out.println("Binary equivalent of:" +value+":"+Integer.toBinaryString(value));
		// get the integer equivalent of the highest one's bit
		System.out.println("Highest one's bit equivalent:"+Integer.highestOneBit(value));
System.out.println();
		int i=2000;
	System.out.println("Binary equivalent:"+i+":"+Integer.toBinaryString(i));
	System.out.println("Highest one's bit equivalnet:"+Integer.highestOneBit(i));
	System.out.println("");
	int j=110;
	System.out.println("Binary equivalent:"+j+":"+""+Integer.toBinaryString(j));
	System.out.println("higehest one's bit equivalent:"+Integer.highestOneBit(j));
	}

	}


