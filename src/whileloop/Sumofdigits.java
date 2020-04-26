package whileloop;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two or more digit number:");
		int n= sc.nextInt();
		int sum = 0,r;
		while(n!=0)
		{
		 r=n%10;
		 n=n/10;
		 sum= sum+r;
		}
		System.out.println("Sum of digits is:" +sum);

	}

}
