package naveenInterviewQuestions;

public class Swap_String_Variables {

	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("before swapping//");
		System.out.println("a value is:" +a);
		System.out.println("b value is:" +b);
		
		//1. append a and b
		a = a+b;
		
		//2. Store initial string a in string b
		b = a.substring(0, a.length()-b.length());
		
		//3. Store initial string b in string a
		a = a.substring(b.length());
		System.out.println("After swapping//");
		System.out.println("a value is:" +a);
		System.out.println("b value is:" +b);
		
	}

}
