package naveenInterviewQuestions;

public class Reverse_String {

	public static void main(String[] args) {
		
		String str = "Selenium";
	//1st method
		
		String rev = "";
			for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);

	// 2nd method
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());   
		
	//3rd method using Character array
		
		char a[] = str.toCharArray();
		int len = str.length();
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		System.out.println(rev);
		
	}

}
