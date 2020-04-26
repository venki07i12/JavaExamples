
// Check the sequence of Execution
package constructor;

public class StaticBlock {

	int a;
	{
		System.out.println("Instance Block");
	}
	StaticBlock()
	{
		System.out.println("Default Constructor");
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("Main Method");
		StaticBlock sb = new StaticBlock();
		System.out.println("Thank you");
		
	}
	static
	{
		System.out.println("Static Bloack");
	}

}
