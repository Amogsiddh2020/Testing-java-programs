package simplecorejava_programs.java;

public class Multiplication_table_whileloop {

	public static void main(String[] args) {
		int num = 9, i = 1;
        while(i <= 10)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
        System.out.println("***********************************************");
        int num1 = 16, j = 1;
        while(j <= 10)
        {
            System.out.printf("%d * %d = %d \n", num1, j, num1 * j);
            j++;
        }
         System.out.println("*********************************************");
        int n= 28, k = 1;
        while(k<= 10)
        {
            System.out.printf("%d * %d = %d \n", n, k, n * k);
            k++;
        }
        
	}

}
