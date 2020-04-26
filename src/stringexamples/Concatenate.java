//WAP to Concatenate two or more Strings without using library function.


package stringexamples;

import java.util.Scanner;

public class Concatenate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String:");
		String str1 = sc.next();
		System.out.println("Enter second String:");
		String str2 = sc.next();
		System.out.println("Result after Concatenate");
		System.out.println(str1+ " "+str2);
	}

}
