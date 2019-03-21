package venkesh_sir_6PM_batch_programs;

import java.util.Scanner;

class EmpDetail
    {
    	String empName,empId,empDesg;
    	int empSal;
    	
    	void getEmpDetls()
    	{
    		System.out.println("Emp name is:"+empName);
    		System.out.println("Emp Id is: "+empId);
    		System.out.println("Emp Desgnition is: "+empDesg);
    		System.out.println("Emp monthly  salary is: "+empSal);
    		System.out.println("***********************************");
    	}
    }
    	
    	class EmpDepartment
    	{
    		String empDprtmnt,dprtAddress,dprtmntHeadOffice,dprtBranchName;
    	   
    		void empDeprtmentDetails()
    		{
    			System.out.println("Emp Department is: "+empDprtmnt);
    			System.out.println("Emp Department Address is: "+dprtAddress);
    			System.out.println("Emp Department Head office Name:"+dprtmntHeadOffice);
    			System.out.println("Emp Department Branch Name is: "+dprtBranchName); 
    			System.out.println("*********************************");
    			}
    }
              
    	
    	
    	class ProductDetails
    	{
    		String productCode,productName;
    		int productPrice,productQty;
    		
    		void productDetails()
    		{
    			System.out.println("Product code: "+productCode);
    			System.out.println("Product Name : "+productName);
    			System.out.println("Product price: "+productPrice);
    			System.out.println("Product quantity: "+productQty);
    		}
    	}

public class EmpDetlsprogmByScannerclass 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		EmpDetail ed=new EmpDetail();
		
		System.out.println("enter the Emp Id: ");
		ed.empId=s.nextLine();
		System.out.println("enter Emp Name: ");
		ed.empName=s.nextLine();
		System.out.println("enter Emp Desgnition: ");
		ed.empDesg=s.nextLine();
		System.out.println("enter Emp salary: ");
		ed.empSal=Integer.parseInt(s.nextLine());
		
		
		
		EmpDepartment ed1=new EmpDepartment();
		System.out.println("enter Emp Department Name: ");
		ed1.empDprtmnt=s.nextLine();
		System.out.println("enter Emp Department Address: ");
		ed1.dprtAddress=s.nextLine();
		System.out.println("enter Branch Name of Department:");
		ed1.dprtBranchName=s.nextLine();
		System.out.println("enter Department Head Office Name:");
		ed1.dprtmntHeadOffice=s.nextLine();
		
		ProductDetails pd=new ProductDetails();
		
		System.out.println("enter product code:");
		pd.productCode=s.nextLine();
		System.out.println("enter Product Name: ");
		pd.productName=s.nextLine();
		System.out.println("enter Product Price: ");
		pd.productPrice=Integer.parseInt(s.nextLine());
		System.out.println("enter Product Quantity: ");
		pd.productQty=Integer.parseInt(s.nextLine());
		
		ed.getEmpDetls();
		
		ed1.empDeprtmentDetails();
		
		pd.productDetails();
  				
	}
}
