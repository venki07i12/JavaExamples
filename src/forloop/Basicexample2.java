package forloop;

import java.util.Scanner;

public class Basicexample2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number:");
	int n = sc.nextInt();
	for(int i=1; i<=n; i++)
	{
		System.out.println(i);
	}
	}

}
