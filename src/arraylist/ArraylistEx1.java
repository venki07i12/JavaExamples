package arraylist;

import java.util.ArrayList;

public class ArraylistEx1 {

	//1.Java ArrayList class uses a dynamic array for storing the elements. 
	//2. It inherits AbstractList class and implements List interface.
	public static void main(String[] args) {
		
		//int a[]= new int[3]; // static array
				
		ArrayList ar = new ArrayList(); //dynamic array
		
		//1. Can contain duplicate values
		//2. Maintains insertion order
		//3. not Synchronized
		//4. allaows random access to fetch the element because it stores the values on the basis of indexes
		
		ar.add(10); //0
		ar.add(20); //1
		ar.add(30); //2
		ar.add(40); //3
		System.out.println(ar.size()); //size of array
		
		ar.add(50); //4
		ar.add(50); //5
		/*
		 * ar.add(12,33); 
		 * ar.add("Test"); 
		 * ar.add('v'); 
		 * ar.add(true);
		 */
		

		System.out.println(ar.size());
		// to print all the values from arraylist
		//1. using for loop
		//2. using iterator
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		//non generic vs generic
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); 
		
			ar1.add(12,33); 
			// ar1.add("Test"); it will not allow
			//ar1.add('v');  it will not allow
			//ar1.add(true); it will not allow
		
		ArrayList<String> ar2 = new ArrayList<String>(); 
			ar2.add("Test"); 
		
		//	ArrayList<E> ar2 = new ArrayList<E>(); it will accept any type of data but generally we don't use this...
			
			
			
	}

}
