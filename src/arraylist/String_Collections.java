package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class String_Collections {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Venkatesh");
		al1.add("Rushi");
		al1.add("Varshini");
		al1.add("Hyderabad");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Cuty");
		al2.add("varshu");
		al2.add("Ram");
		al2.add("Trump");
		
		System.out.println(al1);
		al1.addAll(al2);
		
		System.out.println(al1);
		
		Collections.sort(al1);
		System.out.println(al1);
		
		for(int i=0; i<al1.size(); i++)
		{
			System.out.println(al1.get(i));
		}
		System.out.println("===============");
		
		al1.removeAll(al2);
		for(int i=0; i<al1.size(); i++)
		{
			System.out.println(al1.get(i));
		}
		
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("Venkatesh");
		al3.add("Software Testing");
		
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("Rushiketh");
		al4.add("Software Testing");
		
		System.out.println("===============");
		al3.retainAll(al4);
		
		for(int i=0; i<al3.size();i++)
		{
			System.out.println(al3.get(i));
		}

	}

}
