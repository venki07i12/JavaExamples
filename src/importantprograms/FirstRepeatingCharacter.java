package importantprograms;

import java.util.HashSet;

public class FirstRepeatingCharacter {

	
	 static char firstRepeating(char str[]) 
	    { 
	        // Creates an empty hashset 
	        HashSet<Character> h = new HashSet<>(); 
	  
	        // Traverse the input array from left to right 
	        for (int i=0; i<=str.length-1; i++) 
	        { 
	            char ch = str[i]; 
	  
	            // If element is already in hash set, update x 
	            // and then break 
	            if (h.contains(ch)) 
	                return ch; 
	  
	            else // Else add element to hash set 
	                h.add(ch); 
	        } 
	         return '\0'; 
	    } 
	public static void main(String[] args) {
		 String str = "geeksforgeeks"; 
	        char[] arr = str.toCharArray(); 
	        System.out.println(firstRepeating(arr)); 
		

	}

}
