package corejavaprograms.java;

public class Simple_program2 {

	public static void main(String[] args) {
		// Get one default system property
				System.out.println("Default property:"+ Integer.getInteger("sun.arch.data.model"));
				// set a custom property
				System.setProperty("test.integer", "10");
				// get the value of the custom property we set
				System.out.println("Custom Property:" + Integer.getInteger("test.integer"));

	}

}
