package stringexamples;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your statement:");
	String str=sc.next();
	
	String reverse = new StringBuffer(str).reverse().toString();
	if(str.equals(reverse))
	{
		System.out.println("Given number is palindrome");
	}
	else
		System.out.println("Given number is not a palindrome");
	//System.out.println(str);
	System.out.println(reverse);

	}

}

// examples for Palindrome are
// madam
//racecar etc..
