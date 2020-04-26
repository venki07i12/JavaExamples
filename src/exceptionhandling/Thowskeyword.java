package exceptionhandling;

public class Thowskeyword {

	public static void main(String[] args)  {
		Thowskeyword obj = new Thowskeyword();
				obj.sum();
		System.out.println("Hello");  
	}
		public void sum()
		{
			try {
				devide();
			} catch (ArithmeticException e) {
				//e.printStackTrace();
			}
		}

	
		public void devide() throws ArithmeticException
		{
			int i =9/0;  //exception line
		}
// The throws keyword is used to declare exception. 
// It doesn't throw an exception. It specifies that there may occur an exception in the method. 
// It always used with method signature.
}
