// Check the sequence of Execution

package constructor;

public class InstanceBlock {

	int a, b;
	InstanceBlock()   // Default Constructor
	{
		System.out.println("Default Constructor");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		InstanceBlock ib = new InstanceBlock();
	}
	{ 	// Instance Block
		System.out.println("Instance Block");
	}

}

