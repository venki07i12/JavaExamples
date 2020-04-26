package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistmethods {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		al.add("Venkat");
		al.add("Rushiketh");
		al.add("Varshini");
		al.add("Vishnu");
		al.add("Ram");

		System.out.println(al);
		
		al.add("ravi");
		System.out.println(al);
				
		al.add(2,"Pavan"); // add element at the specified index
		System.out.println(al);
		
		System.out.println("=================");
		
		al.remove(3);
		System.out.println("After removed 3rd index");
		System.out.println(al);
		
		al.remove("Pavan");
		System.out.println(al);
		
		System.out.println("Size of Arraly lis:" +al.size());
		System.out.println("Enter EMP name:");
		String s1 = sc.next();
		if(al.contains(s1))
			System.out.println("Employee is available");
		else 
			System.out.println("Employee is not availble");
		al.clear();
		System.out.println("Your arraylist is:" +al);
		
	}

}
