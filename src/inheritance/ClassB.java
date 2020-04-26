package inheritance;

public class ClassB extends ClassA {

	int p=5, q=7;
	void m2()
	{
		int r = x+y+p+q;
		System.out.println("B Class sum is:" +r);
	}
	
}