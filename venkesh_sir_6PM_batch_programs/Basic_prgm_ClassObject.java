package venkesh_sir_6PM_batch_programs;

class Colleage
{
	
	String clgName,clgLocation;
	int clgStreength;
	
	void getCollegeInfo()
	{
		System.out.println("college name is: "+clgName+"\n");
		System.out.println("college location is: "+clgLocation+"\n");
		System.out.println("college student strength: "+clgStreength+"\n");
	}
	}
class Department
{
	String deprtName;
	int noofStudent,noOfTeacher;
	
	void getDepartmentInfo()
	{
		System.out.println("department name is: "+deprtName+"\n");
		System.out.println("no of student is: "+noofStudent+"\n");
		System.out.println("no of teacher is: "+noOfTeacher+"\n");
	}
	
}

public class Basic_prgm_ClassObject {

	public static void main(String[] args) 
	{
		Colleage c=new Colleage();
		c.clgName="A G Patil polyetechnic solapur";
		c.clgLocation="Vijapur highway,near S.R.P.F Camp,Solapur";
		c.clgStreength=452;
		
		Department d=new Department();
		d.deprtName="Computer Science & engginering";
		d.noofStudent=89;
		d.noOfTeacher=15;
		
		c.getCollegeInfo();
		d.getDepartmentInfo();

	}

}
