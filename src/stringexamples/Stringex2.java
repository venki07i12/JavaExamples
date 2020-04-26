package stringexamples;



public class Stringex2 {

	public static void main(String[] args) {
		
		String email = "user@example.com";
		String domain = email.substring(email.indexOf("@") +1);
		System.out.println(domain);
		
		    


	}

}
