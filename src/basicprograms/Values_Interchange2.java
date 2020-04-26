package basicprograms;

public class Values_Interchange2 {

	public static void main(String[] args) {
		int x = 2, y =3;
		
		x = x^y;
		y = x^y;
		x = x^y;
		
		System.out.println("X value is: " +x);
		System.out.println("Y value is: " +y);

	}

}
