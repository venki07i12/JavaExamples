package stringexamples;

public class Print_letters_from_StringInt {

	public static void main(String[] args) {
		String s = "venk1234eshIPPA4567";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(Character.isLetter(ch))
			//if(Character.isUpperCase(ch))
			//if(Character.isLowerCase(ch))
				System.out.print(ch);
		}

	}

}
