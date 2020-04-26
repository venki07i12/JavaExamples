package constructor;

public class Defaultvalues {

	
	int eid;
	String ename;
	double sal;
	public void show()
	{
		System.out.println("Emp id is:" +eid);
		System.out.println("Emp Name is:" +ename);
		System.out.println("Emp Salary is:" +sal);
		
	}
	public static void main(String[] args) {
		Defaultvalues d = new Defaultvalues();
		d.show();

	}

}
