package exceptionhandling;

public class Example2 {

	public static void main(String[] args) {
		//uncaught exception
		//int i = 9/0;
		//System.out.println(i);
		
		//Caught exception
		//Thread.sleep(3000);
		
		//1. try - catch block
		try {
			int i=9/0; // This code will give an exception
			
		} catch(Throwable e) //Throwable exception
		{
			e.printStackTrace();
	
		}
		
		System.out.println("Hello");
	
	//	The try keyword is used to specify a block where we should place exception code. 
	//	The try block must be followed by either catch or finally. 
	//	It means we can't use try block alone.

	}

}
