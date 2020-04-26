package methodoverloading;

public class Overloadingex1 {
	
	void sum(int x, int y)
	{
		int z= x+y;
		System.out.println("Sum of Z value is:" +z);
	}
	
	void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("Sum of D value is:" +d);
	}

	public static void main(String[] args) {
		
		Overloadingex1 mo = new Overloadingex1();
		mo.sum(2, 3);
		mo.sum(3, 5, 6);
		
	}

}
