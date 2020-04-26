package stringexamples;

import java.util.ArrayList;

public class Converting_String_to_Arracy {

	//public static void main(String[] args) {
		
		//String[]array= {"rajkamal","mamidala"};
//		ArrayList<String>list=new ArrayList<String>(Arrays.asList(array));
//		System.out.println(list);
//		
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("raj");
		list.add("kamal");
		list.add("vijay");
		list.add("prathibbha");
		String[]a=new String[list.size()];
		list.toArray(a);
		for(String b:a) {
			System.out.println(b);
		}
		

	}

}
