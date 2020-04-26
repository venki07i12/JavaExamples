// Create a loan class with loanid, loantype, Amount, time, rate of interest. Create two objects and display details.

package constructor;

public class Constructorex3 {

	int loanid;
	String lname;
	double LAmount;
	int tenure;
	double rof;
	Constructorex3(int id, String name, double Amount, int time, double interest)
	{
		loanid = id;
		lname = name;
		LAmount = Amount;
		tenure = time;
		rof = interest;
	}
	
	public void show()
	{
		System.out.println("Loan ID is:" +loanid);
		System.out.println("Loan type is:" +lname);
		System.out.println("Loan Amount is:" +LAmount);
		System.out.println("Loan Tenure period is:" +tenure);
		System.out.println("Loan Rate of Interset is:" +rof);
	}
	
	
	public static void main(String[] args) {
		
		Constructorex3 l1 = new Constructorex3(101, "Venkat", 500000, 3, 8.5);
		Constructorex3 l2 = new Constructorex3(102, "Venkat", 600000, 6, 9.5);
		l1.show();
		System.out.println();
		l2.show();
		
	}

}
