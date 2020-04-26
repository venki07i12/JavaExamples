package switchexamples;

import java.util.Scanner;

public class Switchex3 {


	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter any Number : ");
		int  n = sc.nextInt() ;
		switch(n)
		{
			case  1 :  System.out.println(" ONE ");
							   break;
			case  2 :  System.out.println(" Two ");
							   break;
			case  3 :  System.out.println(" THREE ");
							   break;
			default: System.out.println(" Select 1/2/3 only ");
		}

	}

}
