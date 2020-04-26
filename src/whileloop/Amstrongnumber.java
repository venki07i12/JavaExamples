//WAP to find given number is Amstrong number or not

// examples 153, 370, 371, 407

package whileloop;

import java.util.Scanner;

public class Amstrongnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n= sc.nextInt();
		int sum = 0,r,t=n;
		while(n!=0)
		{
		 r=n%10;
		 n=n/10;
		 sum= sum+(r*r*r);
		}
		if(t==sum)
		System.out.println(t+" Amstraon");
		else
		System.out.println(t+" not an Amstrong");

	}

}
