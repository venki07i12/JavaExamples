package arraylist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistex1 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		//add
		ll.add("Venkatesh");
		ll.add("Selenium");
		ll.add("Testing");
		ll.add("RPA");
		System.out.println(ll);
		System.out.println(ll.size());
		
		//add first
		ll.addFirst("Naveen");
		
		//add last
		ll.addLast("Kumar");
		
		System.out.println(ll);
		
		//get
		System.out.println(ll.get(0));
		//set
		ll.set(0, "Pavan");
		System.out.println(ll);
		
		// remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		ll.remove(3);
		System.out.println(ll);
		
//how to print all the values of LinkedList 
		
		System.out.println("using for loop"); //for loop
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("using advanced for loop"); // for each loop
		for(String str:ll)
		{
			System.out.println(str);
		}
		
		System.out.println("using iterator"); ///Iterator
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("using while loop"); //while loop
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
		
	}

}
