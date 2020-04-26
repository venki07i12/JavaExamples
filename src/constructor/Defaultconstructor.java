package constructor;

public class Defaultconstructor {
	
	int eid;
	String ename;
	double sal;
	
	Defaultconstructor()
	{
		eid = 1001;
		ename = "Venkat";
		sal = 50000;
	}
	void show()
	{
		System.out.println("Employee ID is:" + eid);
		System.out.println("Employee name is:" +ename);
		System.out.println("Employee Salary is:" +sal);
	}
	
	public static void main(String[] args) {
		Defaultconstructor dc = new Defaultconstructor();
			dc.show();
		
	}

}
