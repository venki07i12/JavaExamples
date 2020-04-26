package forloop;

public class ReverseString {

	public static void main(String[] args) {
	
		String str = "Hello#1234";
		
		char legth[]=str.toCharArray();
		System.out.println(str.length());
		for(int i=4; i>=0; i--)
		{
			System.out.print(legth[i]);
		}
		System.out.print("#");
		for(int j=9; j>=6; j--)
		{
			System.out.print(legth[j]);
		}
	}

}
