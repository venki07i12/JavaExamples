package differentwaystocallobject;

public class Test extends Demo{
	
	void m1()
	{
		System.out.println("Test class m1");
	}

	void m2()
	{
		System.out.println("Test class m2");
	}
	
	public static void main(String[] args) {
	
	//1 way 
		Demo d = new Demo();
		d.m1();
		//d.m2();   // error - method m2() is undefined for the type Demo
		
	// 2 way
		Test t = new Test();
		t.m1();
		t.m2();
		
	//3 way
		Demo d1 = new Test();
		d1.m1();
		//d1.m2();
	
	//4 way
		//Test t = new Demo();
		
		
		
	}

}
