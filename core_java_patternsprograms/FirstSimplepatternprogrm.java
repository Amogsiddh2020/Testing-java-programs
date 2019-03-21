package core_java_patternsprograms;

public class FirstSimplepatternprogrm {

	public static void main(String[] args) {
		 int i,j,lines=5;  
		   for(i=1;i<=lines;i++){// this loop is used to print the lines  
		      for(j=lines;j>=1;j--){// this loop is used to print numbers in a line  
		          if(j!=i)  
		           System.out.print(j);  
		           else  
		            System.out.print("*");  
		   }  
		   System.out.println("");  
		   }  
      System.out.println("************************************************************");
      int p,q,lines1=7;  
	   for(p=1;p<=lines1;p++){// this loop is used to print the lines  
	      for(q=lines;q>=1;q--){// this loop is used to print numbers in a line  
	          if(q!=p)  
	           System.out.print(q);  
	           else  
	            System.out.print("*");  
	   }  
	   System.out.println("");  
	   }  
      
	}

}
