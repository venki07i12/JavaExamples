package forloop;

import java.util.Scanner;

public class Sum_of_n_numberofvalues {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i<=10; i++)
		{
			System.out.println("Enter any number:");
			int n = sc.nextInt();
			sum = sum+n;

		}
		
			System.out.println("Sum is:" +sum);

	}

}
