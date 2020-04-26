package forloop;

import java.util.Scanner;

public class Sum_of_divisibleby5_in_Givenno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i<=n; i++)
		{
			if(i%5==0)
			sum = sum+i;
			
		}
		System.out.println("Sum is:" +sum);


	}

}
