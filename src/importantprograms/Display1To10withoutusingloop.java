package importantprograms;

public class Display1To10withoutusingloop {

	
	 public static void printWithoutLoop(int n) {
	        if (n <= 10) {
	            System.out.println(n);
	            printWithoutLoop(n + 1);
	        }
	    }
	 
	public static void main(String[] args) {
		 printWithoutLoop(1);

	}

}
