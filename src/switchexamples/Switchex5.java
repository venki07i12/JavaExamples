package switchexamples;

import java.util.Scanner;

public class Switchex5 {

	public static void main(String[] args) {
		
			Scanner   sc  =  new  Scanner(System.in);
			System.out.print(" Enter any 2 Numbers : ");
			int  a = sc.nextInt();
			int  b = sc.nextInt();
			System.out.println("1.  Add " );
			System.out.println("2.  Sub ");
			System.out.println("3.  Mul ");
			System.out.println("4.  Div ");
			System.out.print(" Enter your Choice : ");
			int  ch  =  sc.nextInt( );
	         int  c;
			switch(ch)
			{
				case 1 :   c = a + b ;
								System.out.println(" Sum  is   : " +c);
								break;
				case  2 :   c  =  a - b;
								System.out.println(" Sub  is  : " +c );
								break;
				case 3:  c = a * b ; 
							    System.out.println("  Mul  is  : " +c);
								break;
			   case  4:   c  =  a/ b;
			   					 System.out.println(" Div  is : "+c);
								 break;
			  default: 
				             System.out.println(" Select 1/2/3/4 only ");
			}
	}

}
