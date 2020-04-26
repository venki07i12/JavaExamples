package arraylist;

import java.util.ArrayList;

public class ArraylistEx3 {

	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>(); 
		ar1.add("venkat");
		ar1.add("selenium");
		ar1.add("tester");
		
		ArrayList<String> ar2 = new ArrayList<String>(); 
		ar2.add("Rushiketh");
		ar2.add("QTP");
		ar2.add("Developer");
		
		ar1.addAll(ar2); // add all
		for(int i=0; i<ar1.size(); i++)
		{
			System.out.println(ar1.get(i));
		}
		
		System.out.println("=======================");
		
		ar1.removeAll(ar2); //remove all
		for(int i=0; i<ar1.size(); i++)
		{
			System.out.println(ar1.get(i));
		}
		
		System.out.println("=======================");
		
		ArrayList<String> ar3 = new ArrayList<String>(); 
		ar3.add("venkat");
		ar3.add("selenium");
		ar3.add("testing");
		
		ArrayList<String> ar4 = new ArrayList<String>(); 
		ar4.add("Rushiketh");
		ar4.add("QTP");
		ar4.add("testing");
			  
		ar3.retainAll(ar4); // it will give the common value in both the arraylist
		
		for(int i=0; i<ar3.size(); i++) 
		{
		System.out.println(ar3.get(i)); 
		}
		 
		
	}

}
