package stringexamples;

public class Print_integers_from_String {

	public static void main(String[] args) {
		String s = "IPPAvenk1234eshi4567sjh010101";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch))
				System.out.print(ch);
			

		/*	if(Character.isAlphabetic(ch))
				System.out.print(ch);

			if(Character.isLowerCase(ch))
				System.out.print(ch);

			if(Character.isUpperCase(ch))
				System.out.print(ch);	*/
		}

	}

}
