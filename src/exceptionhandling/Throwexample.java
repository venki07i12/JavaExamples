package exceptionhandling;

public class Throwexample {

	public static void main(String[] args) {
		
		System.out.println("ABC");
		
		try {
			throw new Exception("Venkatesh own Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("XYZ");
	}

}
