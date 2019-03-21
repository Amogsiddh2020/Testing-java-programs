package Simple_String_Programs;

public class Count_vowels_constantsWith_Capital {

	public static void main(String[] args) {
		System.out.println("Program of count the vowels & constants of upper case:");
		System.out.println("");
		System.out.println("*********************************************");
		String r,s="welcome to solapur,maharasthra";
		r=s.toUpperCase();
		System.out.println("The given string is:"+s);
		System.out.println();
		System.out.println("The given string with upper case:"+r);
		int vowel_c=0,constant_c=0;
		for(int i=0;i<r.length();i++)
		{
		if(r.charAt(i)=='A' || r.charAt(i)=='E' || r.charAt(i)== 'I' || r.charAt(i)== 'O' || r.charAt(i)== 'U')
		{	
			vowel_c++;
		}
			
		else if(r.charAt(i) >= 'A' && r.charAt(i) <='Z') 
		{
			constant_c++;	
			}
		}
		System.out.println("no of vowels in the given string is:"+vowel_c);
        System.out.println("no of constants in the given string is:"+constant_c);
        
}
}