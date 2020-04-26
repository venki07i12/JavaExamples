package naveenInterviewQuestions;

public class Swap_Integer_Variables {

	public static void main(String[] args) {
	
	//Using 3rd Variable 
		
		int x = 5;
		int y = 10;
		int z;
		
		/* z = x; //5
		x = y; //10
		y = z; //5
		System.out.println("X Value is:" +x);
		System.out.println("Y Value is:" +y); */
		
	//without using 3rd Variable: using + operrator 
		
	/*	x = x+y; //15
		y = x-y; //5
		x = x-y; //10
		System.out.println("X Value is:" +x);
		System.out.println("Y Value is:" +y);  */
 
	//without using 3rd Variable: using * operrator 
		
	/*	x = x*y; //50
		y = x/y; //5
		x = x/y; //10
		System.out.println("X Value is:" +x);
		System.out.println("Y Value is:" +y);  */

	//using XOR ^
		
		x = x^y; //15 --1111 we can convert into bitwise operator
		y = x^y; //10 --1010
		x = x^y; //5  --0101
		System.out.println("X Value is:" +x);
		System.out.println("Y Value is:" +y);
		
		
		
	}

}
