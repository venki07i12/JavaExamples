//WAP to given number is prime number or not

package whileloop;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter any number");
		  int num = sc.nextInt();
		  int i = 2;
	          boolean flag = false;
	          while(i <= num/2)
	            {
	              // condition for nonprime number
	             if(num % i == 0)
	             {
	                flag = true;
	                break;
	             }
	             ++i;
	            }
	            if (!flag)
	            System.out.println(num + " is a prime number.");
	        else
	            System.out.println(num + " is not a prime number.");

	}

}
