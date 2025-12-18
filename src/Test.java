
import java.util.*;


class Employee
{
	
	private int eid;
	private String name;
	private int sal;
	   
   public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	void Disp()
	{
		System.out.println("Employee ID : "+eid);
		System.out.println("Name :"+name);
		System.out.println("Salary : "+sal);
	}
	
}


public class Test {

	public static void main(String[] args) 	{
	   
	     Scanner si=new Scanner(System.in);	
	    
	     Employee Aobj =new Employee();
	     Aobj.setEid(12);
	     Aobj.setName("Sandeep");
	     Aobj.setSal(45000);
	     Aobj.Disp();
	     
	}

}
