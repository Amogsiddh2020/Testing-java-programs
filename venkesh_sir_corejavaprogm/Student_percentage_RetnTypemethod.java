package venkesh_sir_corejavaprogm;

import java.util.Scanner;

class Branch
        {
        	boolean k;
        	boolean getStu(String br)
        	{
        		switch(br)
        		{
        		case "CSE": k=true; 
        		break;
        		
        		case "ECE": k=true;
        		break;
        		
        		case "EEE":k=true;
        		break;
        		
        		default:k=false;
        		}
        	return k;
        		
        	}
        }
        
          class Result
          {
        	  float per;
        	  String result;
        	  
        	  void calculate(int p,int toM)
        	  {
        		  per=(float)toM/6;
        		  
        		  
				if(p==1)
        		  {
					result="Fail";
					
        			 }
				else if(per>=70 && per<=100)
				{
					result="Distiction";
					
				}
				else if(per>60 && per<70)
				{
					result="First class";
				}
				else if(per>50 && per<60)
				{
					result="Second class";
				}
				
				else if(per>35 && per<50)
				{
					result="Third class";
				}
				else
				{
					result="Fail";
					
			}
        	  }
				void getResult()
				{
					System.out.println("percentage:"+per);
					System.out.println("Result: "+result);
				}
		
				
          }
        	  

public class Student_percentage_RetnTypemethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k=0,totM=0;
		System.out.println("enter name:");
		String s1=s.nextLine();
		System.out.println("enter branch:");
		String br=s.nextLine();
		
		
		if(br.length()==3)
		{
			Branch b=new Branch();
			boolean z=b.getStu(br.toUpperCase());
			
			if(z)
			{
				System.out.println("enter roll no:");
				String rno=s.nextLine();
				
				if(rno.length()==10)
				{
					System.out.println("enter six subject marks:");
					int i=1;
					Result rs=new Result();
					
					while(i<=6)
					{
						System.out.println("enter subject:"+i);
						int sub=Integer.parseInt(s.nextLine());
						i++;
						
						if(sub<0 || sub>100)
						{
							System.out.println("indvalid marks");
	                      i--;
	                      continue;
	                      }
						totM=totM+sub;
						if(sub>=0 && sub<=34)
						{
							k=1;
						}

					}
					rs.calculate(k, totM);
					System.out.println("stu name:"+s1);
					System.out.println("Branch:"+br);
					System.out.println("roll No:"+rno);
					rs.getResult();
				}
				else
				{
					System.out.println("Invalid roll No:");
				}
					
			}
			else
			{
				System.out.println("Branch doesnot exist:");
			}
		}
		
		else
		{
			System.out.println("Invalid branch:");
		}

	}

}
