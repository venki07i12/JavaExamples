package naveenInterviewQuestions;

public class Reverse_Integer {

	public static void main(String[] args) {
		
	// 1st Solution
		int num = 123456789;
	  //long num = 123456789342355346675757;
		int rev =0;
		
		while(num !=0)
		{
			rev = rev *10 + num %10;
			num = num/10;
			
		}
		System.out.println(rev);
		
	// 2nd Solution
		int num1 = 12345;
		
		StringBuffer sb = new StringBuffer(String.valueOf(num1)).reverse();
		System.out.println(sb);

	}

}
