package stringexamples;

public class Reverse_String_Or_Palindrome {

	public static void main(String[] args) {
		
		String str = "Hello";
		String rev = "";
		
	for(int i = str.length()-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
	
//2nd Method
		
		String str1 = "madam hello welcome";
				
		for(int i = str1.length()-1; i>=0; i--)
		{
			System.out.print(str1.charAt(i));
		}
	
		
	}

}
