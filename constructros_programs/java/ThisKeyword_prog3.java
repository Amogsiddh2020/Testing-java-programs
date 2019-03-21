package constructros_programs.java;

import java.util.Scanner;

public class ThisKeyword_prog3 
{
	int no;
	String name;
	public ThisKeyword_prog3(int no,String name) 
	{
		this.no=no;
	this.name=name;
		System.out.println("no & name are:"+no+"\n"+name);
		}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter no:");
		int no=Integer.parseInt(s.nextLine());
		System.out.println("enter name:");
		String name=s.nextLine();
		ThisKeyword_prog3 t=new ThisKeyword_prog3(no,name);
	

	}

}
