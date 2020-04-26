package forloop;

import java.util.Scanner;

public class Biggestnumber_in_Givennumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("count of numbers:");
		int n = sc.nextInt();
		int a, max =0;
		for (int i = 1; i<=n; i++)
		{
		System.out.print("Enter any value:");
			a= sc.nextInt();
			if(a>max)
			max=a;
		}
		System.out.println("the biggest no. is" +max);

	}

}
