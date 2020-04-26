//WAP to sum of 5 divisible in a given number

package whileloop;

import java.util.Scanner;

public class Divisibleby5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n= sc.nextInt();
		int sum = 0,r;
		while(n!=0)
		{
		 r=n%10;
		 n=n/10;
		 if(r%5==0)
		 sum= sum+r;
		}
		System.out.println("Sum of 5 divisibles is:" +sum);

	}

}
