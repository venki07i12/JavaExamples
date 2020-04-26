package switchexamples;

import java.util.Scanner;

public class Switchex4 {

	public static void main(String[] args) {
		
			Scanner sc= new Scanner(System.in);
			System.out.print(" Enter any Character : ");
			char  ch = sc.next().charAt(0) ;
			switch(ch)
			{
				case  'R':
				case  'r' :  System.out.println(" RED ");
								   break;
				case  'G':
				case  'g' :  System.out.println(" GREEN ");
								   break;
				case  'B' :
				case  'b' :  System.out.println(" BLUE ");
								   break;
				default: System.out.println(" Select r/g/b only ");
			}

	}
}

