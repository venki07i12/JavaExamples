package methods;

public class Thiskeyword {
	
	static int x = 50;
	public void thismethod()
	{
		int x = 5;
		int y =10;
		int z = x+y;
		System.out.println("X value is: " +x);
		System.out.println("X value is: " +this.x);
		System.out.println("Y value is: " +y);
	}
		public static void main(String[] args) {
			Thiskeyword obj = new Thiskeyword();
			obj.thismethod();
	}

}
