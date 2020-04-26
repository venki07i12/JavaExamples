package constructor;

public class Parameterizedconstructor {

	
	int eid;
	String ename;
	double sal;
	Parameterizedconstructor(int id, String name, double salary)
	{
		eid = id;
		ename = name;
		sal= salary;
	}
	public void show()
	{
		System.out.println("Emp id is:" +eid);
		System.out.println("Emp Name is:" +ename);
		System.out.println("Emp Salary is:" +sal);
		
	}
	public static void main(String[] args) {
		Parameterizedconstructor d1 = new Parameterizedconstructor(101, "venkatesh", 50000);
		Parameterizedconstructor d2 = new Parameterizedconstructor(102, "Rushiketh", 60000);
		d1.show();
		System.out.println();
		d2.show();

	}

}
