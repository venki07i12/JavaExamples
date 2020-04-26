package ifelse;

import java.util.Scanner;

public class Ifexample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter S1 marks:");
		int s1 = sc.nextInt();
		
		System.out.println("Enter S2 marks:");
		int s2 = sc.nextInt();
		
		if(s1>=35 && s2>=35)
		{
			System.out.println("Paased the exams");
		}
			
		System.out.println("Thank you");
	}

}
