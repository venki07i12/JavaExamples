package stringexamples;

import java.util.Scanner;

public class Lastname_to_firstname {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your statement:");
		String str=sc.nextLine();
		
		String[] words = str.split(" ");
		for(int i=words.length-1; i>=0; i--)
		{
			//String word = words[i];
			//System.out.print(" " +word);
			System.out.print(" " +words[i]);
		}

	}

}
