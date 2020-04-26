package forloop;

import java.util.Scanner;

public class Sum_of_odd_numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i<=10; i++)
		{
			System.out.println("Enter any number:");
			int n = sc.nextInt();
			if(n%2!=0)
			sum = sum+n;

		}
		
			System.out.println("Sum is:" +sum);

	}

}
