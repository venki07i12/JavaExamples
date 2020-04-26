package basicprograms;

public class Values_Interchange1 {

	public static void main(String[] args) {
		int x = 5, y=6;
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("X Value is: " +x);
		System.out.println("Y Value is: " +y);
		

	}

}
