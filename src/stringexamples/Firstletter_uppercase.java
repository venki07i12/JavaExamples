package stringexamples;

import java.util.Scanner;

public class Firstletter_uppercase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Senetence here:");
		String str = sc.nextLine();
		String uprcase = "";
		
		Scanner strscan = new Scanner(str);
		while(strscan.hasNext())
		{
			String word = strscan.next();
			uprcase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
			System.out.println("Orginal Sentence is:" +str);
			System.out.println("Sentence after Convert:" +uprcase.trim());
			
		
	}

}
