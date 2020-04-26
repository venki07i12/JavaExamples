package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Number_Sort_Reverse_Collections {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(50);
		al.add(15);
		al.add(23);
		al.add(35);
		al.add(47);
		al.add(58);
		al.add(5);
	
		System.out.println(al);
		
		Collections.swap(al, 0, 2);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
				
		Collections.reverse(al);
		System.out.println(al);
		
	

	}

}
