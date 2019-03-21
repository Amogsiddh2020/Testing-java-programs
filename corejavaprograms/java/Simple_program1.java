package corejavaprograms.java;

public class Simple_program1 {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)
	//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }
		 System.out.println();
		 System.out.println("fibonacci series program");
		 System.out.println();
		 System.out.println("The fibonacci series is:");
		 int m1=0,m2=1,m3,j,count1=15;    
		 System.out.print(m1+" "+m2);//printing 0 and 1    
		    
		 for(j=2;j<count1;j++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  m3=m1+m2;    
		  System.out.print(" "+m3);    
		  m1=m2;    
		  m2=m3;    

	}
		 System.out.println();
		 System.out.println();
		 
		 for(int t=0;t<10;++t)
		 {
			 System.out.println("value of T is:"+t);
			 System.out.println("");
		 }

}
}
