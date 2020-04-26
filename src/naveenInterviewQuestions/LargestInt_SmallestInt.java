package naveenInterviewQuestions;

import java.util.Arrays;

public class LargestInt_SmallestInt {

	public static void main(String[] args) {
		
		int numbers[] = {-10,13,50,8,-88,986}; // you can change numbers
		
		int largest = numbers[0];
		int smallest = numbers[0];

		for(int i=1; i<numbers.length; i++)
		{
			if(numbers[i]>largest) {
				largest = numbers[i];}
			else if(numbers[i]<smallest) {
				smallest = numbers[i];}
			
		}
		
		System.out.println("Given Array is:" +Arrays.toString(numbers));
		System.out.println("Largest number is:" +largest);
		System.out.println("Smallest number is:" +smallest);
	}

}
