package naveenInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_Elements {

	public static void main(String[] args) {
		
		String names[]= {"java","javascript","ruby","C","phython","java", "C"};
		
		// Compare each element === Worst solution
		
		for(int i=0; i<names.length; i++)
		{
			for(int j=i+1; j<names.length; j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("Duplicate element is:" +names[i]);
				}
				
			}
				
		}

		
		// 2nd Solution -- Hashset  ========== Good Solution - o(n)
		
		Set<String> store = new HashSet<String>();
		
		for(String name:names)
		{
			if(store.add(name) == false)
				System.out.println("Duplicate element is:" +name);
		}
		
		
		
	}

}
