package switchexamples;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) 
	{
		Scanner   sc  =   new   Scanner(System.in);
		System.out.println(" Welcome to  MAA BAZAR ");
		System.out.println("  1.  Mobile  " );
		System.out.println("  2.  TAB  " );
		System.out.println("  3.  Systems  " );
		System.out.println("  4.  Laptop  " );
		System.out.print(" Enter Your Choice : ");
		int   ch  =  sc.nextInt( );
		double   cost,total ; 
		int   q ; 
		switch(ch)
		{
			case  1 :  cost = 5000;    
							System.out.println(" Cost of Mobile is : "+cost);
							System.out.print(" Enter Quantity :  ");
							q =  sc.nextInt( );
							total = cost * q;
							System.out.println(" Total Cost  is  : " +total);
						    break;
			case 2 :   cost  = 15000;
							System.out.println(" Cost of Tab is : "+cost);
							System.out.print(" Enter Quantity :  ");
							q =  sc.nextInt( );
							total = cost * q;
							System.out.println(" Total Cost  is  : " +total);
						    break;
			case  3:  cost = 30000;
							System.out.println(" Cost of System is : "+cost);
							System.out.print(" Enter Quantity :  ");
							q =  sc.nextInt( );
							total = cost * q;
							System.out.println(" Total Cost  is  : " +total);
						    break;
			case  4:  cost = 40000;
							System.out.println(" Cost of Laptop is : "+cost);
							System.out.print(" Enter Quantity :  ");
							q =  sc.nextInt( );
							total = cost * q;
							System.out.println(" Total Cost  is  : " +total);
						    break;
			default: 
							System.out.println(" select only 1/2/3/4 ");
		}
	}
}
