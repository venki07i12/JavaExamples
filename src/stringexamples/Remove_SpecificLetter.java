package stringexamples;

import java.util.Scanner;

public class Remove_SpecificLetter {
	
	public static void removeChar(String s, char c)
	{
	int j, count=0, n=s.length();
	char[] t = s.toCharArray();
	for(int i=j=0; i<n; i++)
	{
	if(t[i] !=c)
	t[j++]=t[i];
	else
	count++;
	}
	while(count>0)
	{
	t[j++]='\0';
	count--;
	}
	System.out.println(t);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the statement:");
		String str =sc.nextLine();
		
		System.out.println("Enter the Letter you want to remove:");
		String itr =sc.nextLine();
		
		char l=itr.charAt(0);
		String s= "Edureka";
		removeChar(str, l);

	}

}
