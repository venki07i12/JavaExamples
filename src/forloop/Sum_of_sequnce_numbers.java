package forloop;

import java.util.Scanner;

public class Sum_of_sequnce_numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:");
		int n = sc.nextInt();
		int sum = 0;
		for (int i =1; i<=n; i++)
		{
			sum = sum+i;
			//System.out.println("Sum is:" +sum);
		}

		System.out.println("Sum is:" +sum);

	}

}
