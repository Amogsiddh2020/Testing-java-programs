package core_java_patternsprograms;

public class PatternprogramOFTrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int size = 0;  
	       Character c;  
	       System.out.println();  
	       size = 5;  
	       int i, j, k;  
	       for (i = 0; i < size + 1; i++) { for (j = size; j > i; j--) {  
	               System.out.print(" ");  
	           }  
	           for (k = 0; k < (2 * i - 1); k++) {  
	               System.out.print("*");  
	           }  
	           System.out.println();  
	         }  
	   }  


	}


