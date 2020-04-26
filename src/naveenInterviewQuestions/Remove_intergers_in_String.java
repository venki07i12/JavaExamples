package naveenInterviewQuestions;

public class Remove_intergers_in_String {

	public static void main(String[] args) {
	String str1 = "abcd1234wxyz5678";
	String str2 = "abcd,,,,@wxyz@,,,,,";
	int count=0;
	
	//str1= str1.replaceAll("[^a-zA-Z]", ""); // it will print only Characters
	str1= str1.replaceAll("[a-zA-Z]", "");  // it will print only integers
	System.out.println(str1);


	//str2 = str2.replaceAll("[a-zA-z]", "");
	  str2 = str2.replaceAll("[a-zA-z@]", "");
	//str2 = str2.replaceAll("[^a-zA-z]", "");
	System.out.println(str2);
	
	// To find out the count of ',' //****Interview question
	for(int i=0; i<str2.length(); i++)
	{
		char ch = str2.charAt(i);
		if(ch==',') {
			count++;
	
		}
		
	}
		System.out.println(count);
		
	}

}
