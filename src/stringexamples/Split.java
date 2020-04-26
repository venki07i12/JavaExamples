package stringexamples;

public class Split {

	public static void main(String[] args) {
		
		String s1="VenkatReddy Java and Python Developer";
		String[ ]  s2=s1.split(" ");
		for(String s: s2)
				System.out.println(s);

	}

}
