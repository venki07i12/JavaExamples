package switchexamples;

public class Switchex1 {

	public static void main(String[] args) {
		String str="E";
		switch(str.toLowerCase())
		{
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println(str+ "  is vowel");
		break;
		default:
			System.out.println(str+ "  is Not a vowel");
		}

	}

}
