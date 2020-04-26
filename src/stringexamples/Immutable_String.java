package stringexamples;

public class Immutable_String {

	public static void main(String[] args) {
		
		String s1 = "Edureka";
		String s2 = s1;
		
		System.out.println(s1 == s2);
		
		s1 = "Learning";
		
		System.out.println(s1 == s2);
		
		System.out.println(s2);
		System.out.println(s1);
	}

}
