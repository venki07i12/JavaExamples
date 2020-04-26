// WAP to calculate EMP salary

package constructor;

public class Calculatesalary {

	int empid;
	String ename;
	double esal;
	int eleaves;
	double leavesamt;
	double totsal;
	Calculatesalary(int id, String name, double sal, int leaves)
	{
		empid = id;
		ename = name;
		esal = sal;
		eleaves = leaves;
	
	}
	public void calleavesamt()
	{
		double daysal = esal/30;
		leavesamt = daysal*eleaves;
	}
	
	public void Calsal()
	{
		totsal = esal-leavesamt;
	}
	
	public void show()
	{
		System.out.println("Emp no.of leaves: " +eleaves);
		System.out.println("Leaves amount is:" +leavesamt);
		System.out.println("Total Salary of Emp is: " +totsal);
	}
	
	
	public static void main(String[] args) {
		
		Calculatesalary l1 = new Calculatesalary(101, "Venkatesh", 50000, 5);
		l1.calleavesamt();
		l1.Calsal();
		l1.show();
		
	}

}
