package methodoverriding;

public class Test extends Demo{

	public void show()  // Overriden method
	{
		System.out.println("Test class show");
	}
	
	public static void main(String[] args) {
		
		Test t = new Test(); 
		t.show();           // first preference will give to child class method if there are same methods
			
		}
		
	

}
